package com.ir.twilytics.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ir.twilytics.dao.QueryBuilder;
import com.ir.twilytics.model.Doc;
import com.ir.twilytics.model.FacetsParam;
import com.ir.twilytics.model.Tweet;
import com.ir.twilytics.model.TweetResponse;
import com.ir.twilytics.utils.QueryUtils;

@Service
public class QueryService {

	private static List<Tweet> tweets = new ArrayList<Tweet>();
	private static int todoCount = 3;
	static {

	}

	public List<Tweet> retrieveTweets(String query) {
		List<Tweet> filteredTweets = new ArrayList<Tweet>();
		for (Tweet tweet : tweets) {
			if (true) {

			}
		}
		return filteredTweets;
	}

	@Value("${resource.tasks}")
	private String resource;
	@Value("${resource.tasks}/{id}")
	private String idResource;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private QueryBuilder queryBuilder;

	@Autowired
	private AnalyticsService analyticsService;

	public List<Doc> findAll(String query) {
		String queryStr = (Objects.nonNull(query) && !query.isEmpty()) ? "full_text:(" + query + ")" : "";
		String url = resource + queryBuilder.addQueryText(queryStr).addRows(100).getQuery().toString();
		System.out.println("urls is : " + url);

		return getQueryResponse(url);

	}

	private List<Doc> getQueryResponse(String url) {
		// TODO Auto-generated method stub

		QueryUtils.initialiseRestTemplate(restTemplate);
		TweetResponse tweetResponse = restTemplate.getForObject(url, TweetResponse.class);

		if (!Objects.isNull(tweetResponse) && tweetResponse.getResponse() != null
				&& tweetResponse.getResponse().getDocs() != null) {
			return tweetResponse.getResponse().getDocs();
		} else {
			return new ArrayList<Doc>();
		}
	}

	@Deprecated
	public List<Doc> findAllTweets(String query) {
		String url = resource
				+ queryBuilder.addQueryText("full_text:(" + query + ")").addRows(100).getQuery().toString();
		System.out.println("urls is : " + url);
		QueryUtils.initialiseRestTemplate(restTemplate);
		TweetResponse tweetResponse = restTemplate.getForObject(url, TweetResponse.class);
		if (!Objects.isNull(tweetResponse) && tweetResponse.getResponse() != null
				&& tweetResponse.getResponse().getDocs() != null) {
			return tweetResponse.getResponse().getDocs();
		} else {
			return new ArrayList<Doc>();
		}
	}

	public List<Doc> getFacetedResults(FacetsParam facetsParam, String searchQuery) {
		// TODO Auto-generated method stub
		String query = "";
		if (Objects.nonNull(searchQuery) && !searchQuery.isEmpty()) {
			query = "full_text:(" + searchQuery + ")";
		} else {
			query = (!Objects.isNull(facetsParam.getQuery()) && !facetsParam.getQuery().isEmpty())
					? "full_text:(" + facetsParam.getQuery() + ")"
					: "";
		}
//		String query = (!Objects.isNull(facetsParam.getQuery()) && !facetsParam.getQuery().isEmpty())
//				? "full_text:(" + facetsParam.getQuery() + ")"
//				: "";
		setFilterFieldsInQuery(facetsParam.getPoiName(), "user.screen_name");
		setFilterFieldsInQuery(facetsParam.getLang(), "lang");
		setFilterFieldsInQuery(facetsParam.getLoc(), "user.location");
		//setFilterFieldsInQuery(facetsParam.getTopics(), "full_text");
		setFilterFieldsInQuery(facetsParam.getHashtags(), "hashtags");
		setFilterFieldsInQuery(facetsParam.getMentions(), "mentions");

		String repliesStr = "";
//		if (Objects.nonNull(facetsParam.getReplies()) && !facetsParam.getReplies().isEmpty()) {
//
//			for (String poiName : facetsParam.getReplies()) {
//				Long poiId = analyticsService.getPoiId(poiName);
//				if (Objects.nonNull(poiId) && poiId != 0L) {
//					repliesStr += "replied_to_user_id:" + Long.toString(poiId) + " ";
//				}
//			}
//		}

//		String queryText = query + " " + poiNameQuery + " " + langQuery + " " + locQuery + " " + topicsQuery + " "
//				+ repliesStr;
		String verifiedStr = "";
		if (!Objects.isNull(facetsParam.getVerified()) && !facetsParam.getVerified().isEmpty()) {
			verifiedStr = "verified:"+facetsParam.getVerified();
		}

		String dateRangeStr = "";
		if (Objects.nonNull(facetsParam.getDateTo()) && !facetsParam.getDateTo().trim().isEmpty()
				&& Objects.nonNull(facetsParam.getDateFrom()) && !facetsParam.getDateFrom().trim().isEmpty()) {

			String dateTo = convertDateForSolr(facetsParam.getDateTo());
			String dateFrom = convertDateForSolr(facetsParam.getDateFrom());
			dateRangeStr = "tweet_date:[" + dateFrom + " TO " + dateTo + "}";
		}

		String url = resource + queryBuilder.addQueryText(query).addRows(1000).addFilter(verifiedStr)
				.addFilter(repliesStr).addFilter(dateRangeStr).getQuery().toString();
		System.out.println("urls is : " + url);
		return getQueryResponse(url);
	}

	private String convertDateForSolr(String date) {
		// TODO Auto-generated method stub
		long dateL = Long.valueOf(date);
		Date dateTo = new Date(dateL);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		String formatted = format.format(dateTo);
		System.out.println("Date formatted: " + formatted);
		return formatted;
	}

	private <T> void setFilterFieldsInQuery(List<T> fieldVals, String field) {
		if (!Objects.isNull(fieldVals)) {
			Iterator poiItr = fieldVals.iterator();
			while (poiItr.hasNext()) {
				queryBuilder.addFilter(field + ":" + poiItr.next());
			}
		}

	}

}
