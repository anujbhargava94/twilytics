package com.ir.twilytics.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FacetsParam implements Serializable
{

private Integer rows;
private String facet;
@SerializedName("query")
@Expose
private String query;
@SerializedName("poiName")
@Expose
private List<String> poiName = null;
@SerializedName("lang")
@Expose
private List<String> lang = null;
@SerializedName("hashtags")
@Expose
private List<String> hashtags = null;
@SerializedName("mentions")
@Expose
private List<String> mentions = null;
@SerializedName("loc")
@Expose
private List<String> loc = null;
@SerializedName("dateTo")
@Expose
private String dateTo;
@SerializedName("dateFrom")
@Expose
private String dateFrom;
@SerializedName("verified")
@Expose
private String verified;
private final static long serialVersionUID = -7000547968851912416L;

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
* @param rows
* @param lang
* @param dateFrom
* @param facet
*/
public FacetsParam( String query, List<String> poiName, List<String> lang, List<String> hashtags, List<String> mentions, List<String> loc, String dateTo, String dateFrom, String verified) {
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

public void setRows(Integer rows) {
this.rows = rows;
}

public String getFacet() {
return facet;
}

public void setFacet(String facet) {
this.facet = facet;
}

public String getQuery() {
return query;
}

public void setQuery(String query) {
this.query = query;
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

public List<String> getLoc() {
return loc;
}

public void setLoc(List<String> loc) {
this.loc = loc;
}

public String getDateTo() {
return dateTo;
}

public void setDateTo(String dateTo) {
this.dateTo = dateTo;
}

public String getDateFrom() {
return dateFrom;
}

public void setDateFrom(String dateFrom) {
this.dateFrom = dateFrom;
}

public String getVerified() {
return verified;
}

public void setVerified(String verified) {
this.verified = verified;
}

}