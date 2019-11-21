
package com.ir.twilytics.apipojo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Service
public class Response {

    @SerializedName("numFound")
    @Expose
    private Integer numFound;
    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("docs")
    @Expose
    private List<Doc> docs = null;

    public Integer getNumFound() {
        return numFound;
    }

    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public List<Doc> getDocs() {
        return docs;
    }

    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

}
