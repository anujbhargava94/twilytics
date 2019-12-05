package com.ir.twilytics.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"query",
"poiName",
"lang",
"hashtags",
"mentions",
"loc",
"dateTo",
"dateFrom",
"verified"
})
@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class FacetsParam {

private Integer rows;
private String facet;
@JsonProperty("query")
private String query;
@JsonProperty("poiName")
private List<String> poiName = null;
@JsonProperty("lang")
private List<String> lang = null;
@JsonProperty("hashtags")
private List<String> hashtags = null;
@JsonProperty("mentions")
private List<String> mentions = null;
@JsonProperty("loc")
private List<String> loc = null;
@JsonProperty("dateTo")
private String dateTo;
@JsonProperty("dateFrom")
private String dateFrom;
@JsonProperty("verified")
private String verified;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public FacetsParam() {
}

/**
*
* @param loc
* @param hashtags
* @param poiName
* @param query
* @param mentions
* @param dateTo
* @param verified
* @param row
* @param lang
* @param dateFrom
* @param facet
*/
public FacetsParam(String query, List<String> poiName, List<String> lang, List<String> hashtags, List<String> mentions, List<String> loc, String dateTo, String dateFrom, String verified) {
super();
this.query = query;
this.poiName = poiName;
this.lang = lang;
this.hashtags = hashtags;
this.mentions = mentions;
this.loc = loc;
this.dateTo = dateTo;
this.dateFrom = dateFrom;
this.verified = verified;
}

public Integer getRows() {
return rows;
}

public void setRows(Integer row) {
this.rows = row;
}
public String getFacet() {
return facet;
}

public void setFacet(String facet) {
this.facet = facet;
}

@JsonProperty("query")
public String getQuery() {
return query;
}

@JsonProperty("query")
public void setQuery(String query) {
this.query = query;
}

@JsonProperty("poiName")
public List<String> getPoiName() {
return poiName;
}

@JsonProperty("poiName")
public void setPoiName(List<String> poiName) {
this.poiName = poiName;
}

@JsonProperty("lang")
public List<String> getLang() {
return lang;
}

@JsonProperty("lang")
public void setLang(List<String> lang) {
this.lang = lang;
}

@JsonProperty("hashtags")
public List<String> getHashtags() {
return hashtags;
}

@JsonProperty("hashtags")
public void setHashtags(List<String> hashtags) {
this.hashtags = hashtags;
}

@JsonProperty("mentions")
public List<String> getMentions() {
return mentions;
}

@JsonProperty("mentions")
public void setMentions(List<String> mentions) {
this.mentions = mentions;
}

@JsonProperty("loc")
public List<String> getLoc() {
return loc;
}

@JsonProperty("loc")
public void setLoc(List<String> loc) {
this.loc = loc;
}

@JsonProperty("dateTo")
public String getDateTo() {
return dateTo;
}

@JsonProperty("dateTo")
public void setDateTo(String dateTo) {
this.dateTo = dateTo;
}

@JsonProperty("dateFrom")
public String getDateFrom() {
return dateFrom;
}

@JsonProperty("dateFrom")
public void setDateFrom(String dateFrom) {
this.dateFrom = dateFrom;
}

@JsonProperty("verified")
public String getVerified() {
return verified;
}

@JsonProperty("verified")
public void setVerified(String verified) {
this.verified = verified;
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