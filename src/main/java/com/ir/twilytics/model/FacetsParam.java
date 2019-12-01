package com.ir.twilytics.model;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Service
public class FacetsParam {

	String query;
	List<String> poiName;
	List<String> replies;
	String verified;
	List<String> lang;
	List<String> loc;
	List<String> topics;
	long dateFrom;
	long dateTo;
	List<String> hashtags;
	List<String> mentions;
	
	
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
	public List<String> getReplies() {
		return replies;
	}
	public void setReplies(List<String> replies) {
		this.replies = replies;
	}
	public String getVerified() {
		return verified;
	}
	public void setVerified(String verified) {
		this.verified = verified;
	}
	public List<String> getLang() {
		return lang;
	}
	public void setLang(List<String> lang) {
		this.lang = lang;
	}
	public List<String> getLoc() {
		return loc;
	}
	public void setLoc(List<String> loc) {
		this.loc = loc;
	}
	public List<String> getTopics() {
		return topics;
	}
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	public long getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(long dateFrom) {
		this.dateFrom = dateFrom;
	}
	public long getDateTo() {
		return dateTo;
	}
	public void setDateTo(long dateTo) {
		this.dateTo = dateTo;
	}
	
	
}
