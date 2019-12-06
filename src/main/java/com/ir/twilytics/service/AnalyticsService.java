package com.ir.twilytics.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ir.twilytics.dao.QueryBuilder;
import com.ir.twilytics.model.FacetFields;
import com.ir.twilytics.model.FacetedFieldsResponse;
import com.ir.twilytics.model.FacetsParam;
import com.ir.twilytics.utils.QueryUtils;

@Service
public class AnalyticsService {

	@Value("${resource.tasks}")
	private String resource;
	@Value("${resource.tasks}/{id}")
	private String idResource;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private QueryBuilder queryBuilder;

	public FacetFields getFacetedFields(FacetsParam facetsParam, String searchQuery) {
		// TODO Auto-generated method stub
		String url = resource;
		String query = "";
		if (Objects.nonNull(searchQuery) && !searchQuery.isEmpty()) {
			query = "full_text:(" + searchQuery + ")";
		} else {
			query = (!Objects.isNull(facetsParam.getQuery()) && !facetsParam.getQuery().isEmpty())
					? "full_text:(" + facetsParam.getQuery() + ")"
					: "";
		}
		
		setParamsInQuery(facetsParam);

		url += queryBuilder.addQueryText(query).addFacetField("user.screen_name").addFacetField("lang").addFacetField("hashtags")
				.addFacetField("mentions").addFacetField("user.location").addFacet("on").addFl("user.screen_name").addFl("lang")
				.addRows(0).addFacetLimit(5).getQuery().toString();
		System.out.println("urls is : " + url);

		return getFacetedResponse(url);

	}

	private void setParamsInQuery(FacetsParam facetsParam) {
		// TODO Auto-generated method stub
		setFilterFieldsInQuery(facetsParam.getPoiName(), "user.screen_name");
		setFilterFieldsInQuery(facetsParam.getLang(), "lang");
		setFilterFieldsInQuery(facetsParam.getLoc(), "user.location");
		//setFilterFieldsInQuery(facetsParam.getTopics(), "full_text");
		setFilterFieldsInQuery(facetsParam.getHashtags(), "hashtags");
		setFilterFieldsInQuery(facetsParam.getMentions(), "mentions");

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
		queryBuilder.addFilter(dateRangeStr).addFilter(verifiedStr);
	}

	private FacetFields getFacetedResponse(String url) {
		// TODO Auto-generated method stub
		QueryUtils.initialiseRestTemplate(restTemplate);
		FacetedFieldsResponse facetedFieldsResponse = restTemplate.getForObject(url, FacetedFieldsResponse.class);
		if (!Objects.isNull(facetedFieldsResponse) && !Objects.isNull(facetedFieldsResponse.getResponse())
				&& !Objects.isNull(facetedFieldsResponse.getFacetCounts())
				&& !Objects.isNull(facetedFieldsResponse.getFacetCounts().getFacetFields())) {
			return facetedFieldsResponse.getFacetCounts().getFacetFields();
		} else {
			return null; // Need to change the fall back to default fields
		}
	}

	//queryBuilder is not getting reinitialized 
	public Long getPoiId(String poiName) {
		// TODO Auto-generated method stub
		String url = resource + queryBuilder.addQueryText("user.screen_name:(" + poiName + ")").addRows(0).addFacet("on")
				.addFacetField("user.id").getQuery().toString();
		System.out.println("urls for poiId is : " + url);

		FacetFields response = getFacetedResponse(url);
		if (Objects.nonNull(response) && Objects.nonNull(response.getUserId()) && !response.getUserId().isEmpty()) {
			return response.getUserId().get(0);
		} else
			return 0L;
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
