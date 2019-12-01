package com.ir.twilytics.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "poi_name", "lang", "hashtags", "mentions", "user.location", "poi_id","user.screen_name","user,id" })
public class FacetFields {

	@JsonProperty("poi_name")
	private List<String> poiName = null;
	@JsonProperty("lang")
	private List<String> lang = null;
	@JsonProperty("hashtags")
	private List<String> hashtags = null;
	@JsonProperty("mentions")
	private List<String> mentions = null;
	@JsonProperty("user.location")
	private List<String> userLocation = null;
	@JsonProperty("poi_id")
	private List<Long> poiId = null;
	@JsonProperty("user.screen_name")
	private List<String> userScreenName = null;
	@JsonProperty("user.id")
	private List<Long> userId = null;
	

	@JsonProperty("user.screen_name")
	public List<String> getUserScreenName() {
		return userScreenName;
	}

	@JsonProperty("user.screen_name")
	public void setUserScreenName(List<String> userScreenName) {
		removeCount(userScreenName);
		this.userScreenName = userScreenName;
	}

	@JsonProperty("user.id")
	public List<Long> getUserId() {
		return userId;
	}

	@JsonProperty("user.id")
	public void setUserId(List<Long> userId) {
		removeCount(userId);
		this.userId = userId;
	}

	@JsonProperty("poi_id")
	public List<Long> getPoiId() {
		
		return poiId;
	}

	@JsonProperty("poi_id")
	public void setPoiId(List<Long> poiId) {
		removeCount(poiId);
		this.poiId = poiId;
	}

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("poi_name")
	public List<String> getPoiName() {
		
		return poiName;
	}

	@JsonProperty("poi_name")
	public void setPoiName(List<String> poiName) {
		removeCount(poiName);
		this.poiName = poiName;
	}

	@JsonProperty("lang")
	public List<String> getLang() {
		return lang;
	}

	@JsonProperty("lang")
	public void setLang(List<String> lang) {
		removeCount(lang);
		this.lang = lang;
	}

	@JsonProperty("hashtags")
	public List<String> getHashtags() {
		
		return hashtags;
	}

	@JsonProperty("hashtags")
	public void setHashtags(List<String> hashtags) {
		removeCount(hashtags);
		this.hashtags = hashtags;
	}

	@JsonProperty("mentions")
	public List<String> getMentions() {
		
		return mentions;
	}

	@JsonProperty("mentions")
	public void setMentions(List<String> mentions) {
		removeCount(mentions);
		this.mentions = mentions;
	}

	@JsonProperty("user.location")
	public List<String> getUserLocation() {
		
		return userLocation;
	}

	@JsonProperty("user.location")
	public void setUserLocation(List<String> userLocation) {
		removeCount(userLocation);
		this.userLocation = userLocation;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	private <T> void removeCount(List<T> field) {
		if (Objects.nonNull(field)) {
			for (int i = 1; i < field.size(); i++) {
				field.remove(i);
			}
		}
		
	}

}