package com.ir.twilytics.model;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Query {

	String queryText;
	String tweetDateRange;
	String facet;
	List<String> facetField;
	List<String> fl;
	String facetMatches;
	int rows = 20;
	String wt = "json";
	int facetLimit = 10;
	List<String> filters;

	public List<String> getFilters() {
		return filters;
	}

	public void setFilters(List<String> filters) {
		this.filters = filters;
	}

	public int getFacetLimit() {
		return facetLimit;
	}

	public void setFacetLimit(int facetLimit) {
		this.facetLimit = facetLimit;
	}

	public String getQueryText() {
		if(Objects.nonNull(this.queryText) && !this.queryText.isEmpty()){
			return queryText;
		}
		else {
			return "*:*";
		}
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public String getTweetDateRange() {
		return tweetDateRange;
	}

	public void setTweetDateRange(String tweetDateRange) {
		this.tweetDateRange = tweetDateRange;
	}

	public String getFacet() {
		return facet;
	}

	public void setFacet(String facet) {
		this.facet = facet;
	}

	public List<String> getFacetField() {
		return facetField;
	}

	public void setFacetField(List<String> facetField) {
		this.facetField = facetField;
	}

	public List<String> getFl() {
		return fl;
	}

	public void setFl(List<String> fl) {
		this.fl = fl;
	}

	public String getFacetMatches() {
		return facetMatches;
	}

	public void setFacetMatches(String facetMatches) {
		this.facetMatches = facetMatches;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getWt() {
		return wt;
	}

	public void setWt(String wt) {
		this.wt = wt;
	}

	@Override
	public String toString() {

		String facetFieldStr = new String();
		if (!Objects.isNull(this.facetField)) {

			Iterator fieldIterator = this.facetField.iterator();
			while (fieldIterator.hasNext()) {
				facetFieldStr += "&facet.field=" + fieldIterator.next();
			}
		}

		String flStr = new String();
		if (!Objects.isNull(this.fl)) {
			Iterator flIterator = this.fl.iterator();
			while (flIterator.hasNext()) {
				flStr += "&fl=" + flIterator.next();
			}
		}

		String tweetDateRangeStr = new String();
		if (!Objects.isNull(tweetDateRange)) {
			tweetDateRangeStr = "&tweet_date=" + tweetDateRange;
		}
		String facetStr = new String();
		if (!Objects.isNull(facet)) {
			facetStr = "&facet=" + facet;
		}
		String facetMatchesStr = new String();
		if (!Objects.isNull(facetMatches)) {
			facetMatchesStr = "&facetMatches=" + facetMatches;
		}

		String filtersStr = new String();
		if (!Objects.isNull(this.filters)) {
			Iterator filtersItr = this.filters.iterator();
			while (filtersItr.hasNext()) {
				filtersStr += "&fq=" + filtersItr.next();
			}
		}

		return "q=" + getQueryText() + tweetDateRangeStr + facetStr + facetFieldStr + flStr + facetMatchesStr
				+ filtersStr + "&rows=" + rows + "&facet.limit=" + facetLimit + "&wt=" + wt;
	}

}
