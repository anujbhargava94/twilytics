package com.ir.twilytics.model;


import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FacetCounts implements Serializable
{

    @SerializedName("facet_queries")
    @Expose
    private FacetQueries facetQueries;
    @SerializedName("facet_fields")
    @Expose
    private FacetFields facetFields;
    @SerializedName("facet_ranges")
    @Expose
    private FacetRanges facetRanges;
    @SerializedName("facet_intervals")
    @Expose
    private FacetIntervals facetIntervals;
    @SerializedName("facet_heatmaps")
    @Expose
    private FacetHeatmaps facetHeatmaps;
    private final static long serialVersionUID = 4989942876386658738L;

    public FacetQueries getFacetQueries() {
        return facetQueries;
    }

    public void setFacetQueries(FacetQueries facetQueries) {
        this.facetQueries = facetQueries;
    }

    public FacetFields getFacetFields() {
        return facetFields;
    }

    public void setFacetFields(FacetFields facetFields) {
        this.facetFields = facetFields;
    }

    public FacetRanges getFacetRanges() {
        return facetRanges;
    }

    public void setFacetRanges(FacetRanges facetRanges) {
        this.facetRanges = facetRanges;
    }

    public FacetIntervals getFacetIntervals() {
        return facetIntervals;
    }

    public void setFacetIntervals(FacetIntervals facetIntervals) {
        this.facetIntervals = facetIntervals;
    }

    public FacetHeatmaps getFacetHeatmaps() {
        return facetHeatmaps;
    }

    public void setFacetHeatmaps(FacetHeatmaps facetHeatmaps) {
        this.facetHeatmaps = facetHeatmaps;
    }

}
