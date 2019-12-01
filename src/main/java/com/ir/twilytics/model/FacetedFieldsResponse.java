package com.ir.twilytics.model;


import java.io.Serializable;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Service
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "responseHeader","response", "facet_counts"}) 
public class FacetedFieldsResponse implements Serializable
{

	@JsonProperty("responseHeader")
    @Expose
    private FacetResponseHeader responseHeader;
	@JsonProperty("response")
    @Expose
    private FacetResponse response;
	@JsonProperty("facet_counts")
    @Expose
    private FacetCounts facetCounts;
    private final static long serialVersionUID = 7153929844041055379L;

    @JsonProperty("responseHeader")
    public FacetResponseHeader getResponseHeader() {
        return responseHeader;
    }

    @JsonProperty("responseHeader")
    public void setResponseHeader(FacetResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    @JsonProperty("response")
    public FacetResponse getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(FacetResponse response) {
        this.response = response;
    }

    @JsonProperty("facet_counts")
    public FacetCounts getFacetCounts() {
        return facetCounts;
    }

    @JsonProperty("facet_counts")
    public void setFacetCounts(FacetCounts facetCounts) {
        this.facetCounts = facetCounts;
    }

}
