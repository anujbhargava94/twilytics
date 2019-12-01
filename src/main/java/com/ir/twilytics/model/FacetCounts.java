package com.ir.twilytics.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "facet_queries", "facet_fields", "facet_ranges", "facet_intervals", "facet_heatmaps" })
public class FacetCounts {

	@JsonProperty("facet_queries")
	private FacetQueries facetQueries;
	@JsonProperty("facet_fields")
	private FacetFields facetFields;
	@JsonProperty("facet_ranges")
	private FacetRanges facetRanges;
	@JsonProperty("facet_intervals")
	private FacetIntervals facetIntervals;
	@JsonProperty("facet_heatmaps")
	private FacetHeatmaps facetHeatmaps;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("facet_queries")
	public FacetQueries getFacetQueries() {
		return facetQueries;
	}

	@JsonProperty("facet_queries")
	public void setFacetQueries(FacetQueries facetQueries) {
		this.facetQueries = facetQueries;
	}

	@JsonProperty("facet_fields")
	public FacetFields getFacetFields() {
		return facetFields;
	}

	@JsonProperty("facet_fields")
	public void setFacetFields(FacetFields facetFields) {
		this.facetFields = facetFields;
	}

	@JsonProperty("facet_ranges")
	public FacetRanges getFacetRanges() {
		return facetRanges;
	}

	@JsonProperty("facet_ranges")
	public void setFacetRanges(FacetRanges facetRanges) {
		this.facetRanges = facetRanges;
	}

	@JsonProperty("facet_intervals")
	public FacetIntervals getFacetIntervals() {
		return facetIntervals;
	}

	@JsonProperty("facet_intervals")
	public void setFacetIntervals(FacetIntervals facetIntervals) {
		this.facetIntervals = facetIntervals;
	}

	@JsonProperty("facet_heatmaps")
	public FacetHeatmaps getFacetHeatmaps() {
		return facetHeatmaps;
	}

	@JsonProperty("facet_heatmaps")
	public void setFacetHeatmaps(FacetHeatmaps facetHeatmaps) {
		this.facetHeatmaps = facetHeatmaps;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}