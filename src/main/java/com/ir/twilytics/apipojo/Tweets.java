
package com.ir.twilytics.apipojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tweets {

    @SerializedName("poi_name")
    @Expose
    private String poiName;
    @SerializedName("poi_id")
    @Expose
    private Integer poiId;
    @SerializedName("verified")
    @Expose
    private Boolean verified;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("replied_to_tweet_id")
    @Expose
    private Object repliedToTweetId;
    @SerializedName("replied_to_user_id")
    @Expose
    private Object repliedToUserId;
    @SerializedName("reply_text")
    @Expose
    private Object replyText;
    @SerializedName("tweet_text")
    @Expose
    private String tweetText;
    @SerializedName("tweet_lang")
    @Expose
    private String tweetLang;
    @SerializedName("hashtags")
    @Expose
    private List<Object> hashtags = null;
    @SerializedName("mentions")
    @Expose
    private List<Object> mentions = null;
    @SerializedName("tweet_urls")
    @Expose
    private Object tweetUrls;
    @SerializedName("tweet_emoticons")
    @Expose
    private List<Object> tweetEmoticons = null;
    @SerializedName("tweet_date")
    @Expose
    private String tweetDate;
    @SerializedName("tweet_loc")
    @Expose
    private Object tweetLoc;
    @SerializedName("text_pt")
    @Expose
    private String textPt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("id_str")
    @Expose
    private String idStr;
    @SerializedName("full_text")
    @Expose
    private String fullText;
    @SerializedName("truncated")
    @Expose
    private Boolean truncated;
    @SerializedName("display_text_range")
    @Expose
    private List<Integer> displayTextRange = null;
    @SerializedName("entities")
    @Expose
    private Entities entities;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("in_reply_to_status_id")
    @Expose
    private Object inReplyToStatusId;
    @SerializedName("in_reply_to_status_id_str")
    @Expose
    private Object inReplyToStatusIdStr;
    @SerializedName("in_reply_to_user_id")
    @Expose
    private Object inReplyToUserId;
    @SerializedName("in_reply_to_user_id_str")
    @Expose
    private Object inReplyToUserIdStr;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    private Object inReplyToScreenName;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("geo")
    @Expose
    private Object geo;
    @SerializedName("coordinates")
    @Expose
    private Object coordinates;
    @SerializedName("place")
    @Expose
    private Object place;
    @SerializedName("contributors")
    @Expose
    private Object contributors;
    @SerializedName("is_quote_status")
    @Expose
    private Boolean isQuoteStatus;
    @SerializedName("retweet_count")
    @Expose
    private Integer retweetCount;
    @SerializedName("favorite_count")
    @Expose
    private Integer favoriteCount;
    @SerializedName("favorited")
    @Expose
    private Boolean favorited;
    @SerializedName("retweeted")
    @Expose
    private Boolean retweeted;
    @SerializedName("lang")
    @Expose
    private String lang;

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }

    public Integer getPoiId() {
        return poiId;
    }

    public void setPoiId(Integer poiId) {
        this.poiId = poiId;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Object getRepliedToTweetId() {
        return repliedToTweetId;
    }

    public void setRepliedToTweetId(Object repliedToTweetId) {
        this.repliedToTweetId = repliedToTweetId;
    }

    public Object getRepliedToUserId() {
        return repliedToUserId;
    }

    public void setRepliedToUserId(Object repliedToUserId) {
        this.repliedToUserId = repliedToUserId;
    }

    public Object getReplyText() {
        return replyText;
    }

    public void setReplyText(Object replyText) {
        this.replyText = replyText;
    }

    public String getTweetText() {
        return tweetText;
    }

    public void setTweetText(String tweetText) {
        this.tweetText = tweetText;
    }

    public String getTweetLang() {
        return tweetLang;
    }

    public void setTweetLang(String tweetLang) {
        this.tweetLang = tweetLang;
    }

    public List<Object> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getMentions() {
        return mentions;
    }

    public void setMentions(List<Object> mentions) {
        this.mentions = mentions;
    }

    public Object getTweetUrls() {
        return tweetUrls;
    }

    public void setTweetUrls(Object tweetUrls) {
        this.tweetUrls = tweetUrls;
    }

    public List<Object> getTweetEmoticons() {
        return tweetEmoticons;
    }

    public void setTweetEmoticons(List<Object> tweetEmoticons) {
        this.tweetEmoticons = tweetEmoticons;
    }

    public String getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(String tweetDate) {
        this.tweetDate = tweetDate;
    }

    public Object getTweetLoc() {
        return tweetLoc;
    }

    public void setTweetLoc(Object tweetLoc) {
        this.tweetLoc = tweetLoc;
    }

    public String getTextPt() {
        return textPt;
    }

    public void setTextPt(String textPt) {
        this.textPt = textPt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public List<Integer> getDisplayTextRange() {
        return displayTextRange;
    }

    public void setDisplayTextRange(List<Integer> displayTextRange) {
        this.displayTextRange = displayTextRange;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public Object getContributors() {
        return contributors;
    }

    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public Boolean getIsQuoteStatus() {
        return isQuoteStatus;
    }

    public void setIsQuoteStatus(Boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    public Integer getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Boolean getRetweeted() {
        return retweeted;
    }

    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

}
