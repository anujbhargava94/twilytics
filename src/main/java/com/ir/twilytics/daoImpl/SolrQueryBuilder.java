package com.ir.twilytics.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.ir.twilytics.apipojo.Query;
import com.ir.twilytics.dao.QueryBuilder;


public class SolrQueryBuilder implements QueryBuilder {

	@Autowired
	private Query query;

	@Override
	public QueryBuilder addQueryText(String queryText) {
		// TODO Auto-generated method stub
		this.query.setQueryText(queryText);
		return this;
	}

	@Override
	public QueryBuilder addTweetDateRange(String tweetDateRange) {
		// TODO Auto-generated method stub
		this.query.setTweetDateRange(tweetDateRange);
		return this;
	}

	@Override
	public QueryBuilder addFacet(String facet) {
		// TODO Auto-generated method stub
		this.query.setFacet(facet);
		return this;
	}

	@Override
	public QueryBuilder addFacetField(String facetField) {
		// TODO Auto-generated method stub
		List<String> facets = this.query.getFacetField();
		if(Objects.isNull(facets)) {
			facets = new ArrayList<String>();
		}
		facets.add(facetField);
		this.query.setFacetField(facets);
		return this;
	}

	@Override
	public QueryBuilder addFl(String fl) {
		// TODO Auto-generated method stub
		
		List<String> fls = this.query.getFl();
		if(Objects.isNull(fls)) {
			fls = new ArrayList<String>();
		}
		fls.add(fl);
		this.query.setFl(fls);
		return this;

	}

	@Override
	public QueryBuilder addFacetMatches(String facetMatches) {
		// TODO Auto-generated method stub
		this.query.setFacetMatches(facetMatches);
		return this;
	}

	@Override
	public QueryBuilder addRows(int rows) {
		// TODO Auto-generated method stub
		this.query.setRows(rows);
		return this;
	}

	@Override
	public QueryBuilder addWt(String wt) {
		// TODO Auto-generated method stub
		this.query.setWt(wt);
		return this;
	}

	@Override
	public Query getQuery() {
		// TODO Auto-generated method stub
		return this.query;
	}

}
