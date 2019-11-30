package com.ir.twilytics.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Service
public class FacetParams implements Serializable
{

    @SerializedName("facet.limit")
    @Expose
    private String facetLimit;
    @SerializedName("q")
    @Expose
    private String q;
    @SerializedName("facet.field")
    @Expose
    private List<String> facetField = null;
    @SerializedName("fl")
    @Expose
    private List<String> fl = null;
    @SerializedName("rows")
    @Expose
    private String rows;
    @SerializedName("facet")
    @Expose
    private String facet;
    @SerializedName("wt")
    @Expose
    private String wt;
    private final static long serialVersionUID = 4910313709200491801L;

    public String getFacetLimit() {
        return facetLimit;
    }

    public void setFacetLimit(String facetLimit) {
        this.facetLimit = facetLimit;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
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

    public String getRows() {
        return rows;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }

    public String getFacet() {
        return facet;
    }

    public void setFacet(String facet) {
        this.facet = facet;
    }

    public String getWt() {
        return wt;
    }

    public void setWt(String wt) {
        this.wt = wt;
    }

}
