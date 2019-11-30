package com.ir.twilytics.model;


import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FacetFields implements Serializable
{
	
    @SerializedName("poi_name")
    @Expose
    private List<String> poiName = null;
    @SerializedName("lang")
    @Expose
    private List<String> lang = null;
    @SerializedName("full_text")
    @Expose
    private List<String> fullText = null;
    @SerializedName("hashtags")
    @Expose
    private List<String> hashtags = null;
    @SerializedName("mentions")
    @Expose
    private List<String> mentions = null;
    @SerializedName("user.location")
    @Expose
    private List<String> userLocation = null;
    @SerializedName("poi_id")
    @Expose
    private List<Long> poiId = null;
    private final static long serialVersionUID = 4710932155423927645L;

    public List<Long> getPoiId() {
		return poiId;
	}

	public void setPoiId(List<Long> poiId) {
		this.poiId = poiId;
	}

	public List<String> getPoiName() {
        return poiName;
    }

    public void setPoiName(List<String> poiName) {
        this.poiName = poiName;
    }

    public List<String> getLang() {
        return lang;
    }

    public void setLang(List<String> lang) {
        this.lang = lang;
    }

    public List<String> getFullText() {
        return fullText;
    }

    public void setFullText(List<String> fullText) {
        this.fullText = fullText;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    public List<String> getMentions() {
        return mentions;
    }

    public void setMentions(List<String> mentions) {
        this.mentions = mentions;
    }

    public List<String> getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(List<String> userLocation) {
        this.userLocation = userLocation;
    }

}
