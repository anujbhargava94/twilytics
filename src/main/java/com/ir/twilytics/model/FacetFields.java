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
@JsonPropertyOrder({ "poi_name", "lang", "hashtags", "mentions", "user.location", "poi_id" })
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

	@JsonProperty("poi_id")
	public List<Long> getPoiId() {
		
		return poiId;
	}

	@JsonProperty("poi_id")
	public void setPoiId(List<Long> poiId) {
		if (Objects.nonNull(poiId)) {
			for (int i = 1; i < poiId.size(); i++) {
				poiId.remove(i);
			}
		}
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
		if (Objects.nonNull(poiName)) {
			for (int i = 1; i < poiName.size(); i++) {
				poiName.remove(i);
			}
		}
		this.poiName = poiName;
	}

	@JsonProperty("lang")
	public List<String> getLang() {
		return lang;
	}

	@JsonProperty("lang")
	public void setLang(List<String> lang) {
		if (Objects.nonNull(lang)) {
			for (int i = 1; i < lang.size(); i++) {
				lang.remove(i);
			}
		}
		this.lang = lang;
	}

	@JsonProperty("hashtags")
	public List<String> getHashtags() {
		
		return hashtags;
	}

	@JsonProperty("hashtags")
	public void setHashtags(List<String> hashtags) {
		if (Objects.nonNull(hashtags)) {
			for (int i = 1; i < hashtags.size(); i++) {
				hashtags.remove(i);
			}
		}
		this.hashtags = hashtags;
	}

	@JsonProperty("mentions")
	public List<String> getMentions() {
		
		return mentions;
	}

	@JsonProperty("mentions")
	public void setMentions(List<String> mentions) {
		if (Objects.nonNull(mentions)) {
			for (int i = 1; i < mentions.size(); i++) {
				mentions.remove(i);
			}
		}
		this.mentions = mentions;
	}

	@JsonProperty("user.location")
	public List<String> getUserLocation() {
		
		return userLocation;
	}

	@JsonProperty("user.location")
	public void setUserLocation(List<String> userLocation) {
		if (Objects.nonNull(userLocation)) {
			for (int i = 1; i < userLocation.size(); i++) {
				userLocation.remove(i);
			}
		}
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

}