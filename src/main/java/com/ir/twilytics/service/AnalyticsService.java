package com.ir.twilytics.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.ir.twilytics.dao.QueryBuilder;
import com.ir.twilytics.model.Doc;
import com.ir.twilytics.model.FacetFields;
import com.ir.twilytics.model.FacetedFieldsResponse;

public class AnalyticsService {

	@Value("${resource.tasks}")
	private String resource;
	@Value("${resource.tasks}/{id}")
	private String idResource;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private QueryBuilder queryBuilder;

	public FacetFields getFacetedFields(String query) {
		// TODO Auto-generated method stub
		String url = resource;
		if (query != null && !query.isEmpty()) {
			url += queryBuilder.addQueryText("full_text:(" + query + ")");
		}

		url += queryBuilder.addFacetField("poi_name").addFacetField("lang").addFacetField("hashtags")
				.addFacetField("mentions").addFacetField("user.location").addFacet("on").addFl("poi_name").addFl("lang")
				.addRows(0).getQuery().toString();
		System.out.println("urls is : " + url);

		return getFacetedResponse(url);

	}

	private FacetFields getFacetedResponse(String url) {
		// TODO Auto-generated method stub
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		messageConverters.add(new FormHttpMessageConverter());
		messageConverters.add(new StringHttpMessageConverter());
		messageConverters.add(new GsonHttpMessageConverter());
		restTemplate.setMessageConverters(messageConverters);
		FacetedFieldsResponse facetedFieldsResponse = restTemplate.getForObject(url, FacetedFieldsResponse.class);
		if (!Objects.isNull(facetedFieldsResponse) && !Objects.isNull(facetedFieldsResponse.getResponse())
				&& !Objects.isNull(facetedFieldsResponse.getFacetCounts())
				&& !Objects.isNull(facetedFieldsResponse.getFacetCounts().getFacetFields())) {
			return facetedFieldsResponse.getFacetCounts().getFacetFields();
		} else {
			return null; // Need to change the fall back to default fields
		}
	}

	public Long getPoiId(String poiName) {
		// TODO Auto-generated method stub
		String url = resource + queryBuilder.addQueryText("poi_name:(" + poiName + ")").addRows(0).addFacet("on")
				.addFacetField("poi" + "_id").getQuery().toString();
		System.out.println("urls is : " + url);

		FacetFields response = getFacetedResponse(url);
		if (Objects.nonNull(response) && Objects.nonNull(response.getPoiId())) {
			return response.getPoiId().get(0);
		} else
			return 0L;
	}
}
