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
		String url = resource
				+ queryBuilder.addQueryText("full_text:(" + query + ")").addRows(100).getQuery().toString();
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

	public List<Doc> getFacetedResults(FacetsParam facetsParam) {
		// TODO Auto-generated method stub
		String query = (!Objects.isNull(facetsParam.getQuery()) && !facetsParam.getQuery().isEmpty())
				? "full_text:(" + facetsParam.getQuery() + ")"
				: "";
		String poiNameQuery = getPoiNameQuery(facetsParam.getPoiName());
		String langQuery = getLangQuery(facetsParam.getLang());
		String locQuery = getLocationQuery(facetsParam.getLoc());
		String topicsQuery = getTopicsQuery(facetsParam.getTopics());

		String repliesStr = "";
		if (Objects.nonNull(facetsParam.getReplies()) && !facetsParam.getReplies().isEmpty()) {

			for (String poiName : facetsParam.getReplies()) {
				Long poiId = analyticsService.getPoiId(poiName);
				if (Objects.nonNull(poiId) && poiId != 0L) {
					repliesStr += "replied_to_user_id:" + Long.toString(poiId) + " ";
				}
			}
		}

		String queryText = query + " " + poiNameQuery + " " + langQuery + " " + locQuery + " " + topicsQuery + " "
				+ repliesStr;
		String verifiedStr = "";
		if (!Objects.isNull(facetsParam.getVerified()) && !facetsParam.getVerified().isEmpty()) {
			verifiedStr = "verified:on";
		}

		String dateRangeStr = "";
		if (Objects.nonNull(facetsParam.getDateTo()) && facetsParam.getDateTo() != 0
				&& Objects.nonNull(facetsParam.getDateFrom()) && facetsParam.getDateFrom() != 0) {

			String dateTo = convertDateForSolr(facetsParam.getDateTo());
			String dateFrom = convertDateForSolr(facetsParam.getDateFrom());
			dateRangeStr = "tweet_date:[" + dateTo + " TO " + dateFrom + "}";
		}

		String url = resource + queryBuilder.addQueryText(queryText).addRows(100).addFilter(verifiedStr)
				.addFilter(dateRangeStr).getQuery().toString();
		System.out.println("urls is : " + url);
		return getQueryResponse(url);
	}

	private String convertDateForSolr(long date) {
		// TODO Auto-generated method stub
		Date dateTo = new Date(date);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		String formatted = format.format(dateTo);
		System.out.println("Date formatted: " + formatted);
		return formatted;
	}

	private String getTopicsQuery(List<String> topics) {
		// TODO Auto-generated method stub
		String queryText = new String();
		if (!Objects.isNull(topics)) {

			Iterator poiItr = topics.iterator();
			while (poiItr.hasNext()) {
				queryText += "full_text:" + poiItr.next() + " ";
			}
		}
		return queryText;
	}

	private String getLocationQuery(List<String> loc) {
		// TODO Auto-generated method stub
		String queryText = new String();
		if (!Objects.isNull(loc)) {

			Iterator poiItr = loc.iterator();
			while (poiItr.hasNext()) {
				queryText += "user.location:" + poiItr.next() + " ";
			}
		}
		return queryText;
	}

	private String getLangQuery(List<String> lang) {
		// TODO Auto-generated method stub
		String queryText = new String();
		if (!Objects.isNull(lang)) {

			Iterator poiItr = lang.iterator();
			while (poiItr.hasNext()) {
				queryText += "lang:" + poiItr.next() + " ";
			}
		}
		return queryText;
	}

	private String getPoiNameQuery(List<String> poiName) {
		// TODO Auto-generated method stub
		String queryText = new String();
		if (!Objects.isNull(poiName)) {

			Iterator poiItr = poiName.iterator();
			while (poiItr.hasNext()) {
				queryText += "poi_name:" + poiItr.next() + " ";
			}
		}
		return queryText;
	}

}
