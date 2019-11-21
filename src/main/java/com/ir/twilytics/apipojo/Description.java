
package com.ir.twilytics.apipojo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Service
public class Description {

    @SerializedName("urls")
    @Expose
    private List<Object> urls = null;

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

}
