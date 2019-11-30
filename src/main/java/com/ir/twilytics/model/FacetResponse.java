
package com.ir.twilytics.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FacetResponse implements Serializable
{

    @SerializedName("numFound")
    @Expose
    private Long numFound;
    @SerializedName("start")
    @Expose
    private Long start;
    @SerializedName("docs")
    @Expose
    private List<Object> docs = null;
    private final static long serialVersionUID = 1386237541043462665L;

    public Long getNumFound() {
        return numFound;
    }

    public void setNumFound(Long numFound) {
        this.numFound = numFound;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public List<Object> getDocs() {
        return docs;
    }

    public void setDocs(List<Object> docs) {
        this.docs = docs;
    }

}
