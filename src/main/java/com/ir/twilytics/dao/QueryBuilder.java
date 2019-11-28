package com.ir.twilytics.dao;

import org.springframework.stereotype.Service;

import com.ir.twilytics.apipojo.Query;

@Service
public interface QueryBuilder {

	public QueryBuilder addQueryText(String queryText);


	public QueryBuilder addTweetDateRange(String tweetDateRange);


	public QueryBuilder addFacet(String facet);


	public QueryBuilder addFacetField(String facetField);


	public QueryBuilder addFl(String fl);


	public QueryBuilder addFacetMatches(String facetMatches);


	public QueryBuilder addRows(int rows);


	public QueryBuilder addWt(String wt);
	
	public Query getQuery();
	
	
	
}
