package com.ir.twilytics.apipojo;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class Query {

	String queryText = "*:*";
	String tweetDateRange;
	String facet;
	List<String> facetField;
	List<String> fl;
	String facetMatches;
	int rows = 20;
	String wt = "json";

	public String getQueryText() {
		return queryText;
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

		return "q=" + queryText + tweetDateRangeStr + facetStr + facetFieldStr + flStr + facetMatchesStr + "&rows="
				+ rows + "&wt=" + wt;
	}

}
