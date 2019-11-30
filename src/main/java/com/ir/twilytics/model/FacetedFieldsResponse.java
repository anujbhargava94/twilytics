package com.ir.twilytics.model;


import java.io.Serializable;

import org.springframework.stereotype.Service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Service
public class FacetedFieldsResponse implements Serializable
{

    @SerializedName("responseHeader")
    @Expose
    private FacetResponseHeader responseHeader;
    @SerializedName("response")
    @Expose
    private FacetResponse response;
    @SerializedName("facet_counts")
    @Expose
    private FacetCounts facetCounts;
    private final static long serialVersionUID = 7153929844041055379L;

    public FacetResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(FacetResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public FacetResponse getResponse() {
        return response;
    }

    public void setResponse(FacetResponse response) {
        this.response = response;
    }

    public FacetCounts getFacetCounts() {
        return facetCounts;
    }

    public void setFacetCounts(FacetCounts facetCounts) {
        this.facetCounts = facetCounts;
    }

}
