
package com.ir.twilytics.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "created_at", "id", "full_text", "truncated", "display_text_range",
		"entities.user_mentions.screen_name", "entities.user_mentions.name", "entities.user_mentions.id",
		"entities.user_mentions.indices", "entities.urls.url", "entities.urls.expanded_url",
		"entities.urls.display_url", "entities.urls.indices", "source", "user.id", "poi_id", "user.name",
		"user.screen_name", "poi_name", "user.location", "user.description", "user.url", "user.entities.url.urls.url",
		"user.entities.url.urls.expanded_url", "user.entities.url.urls.display_url", "user.entities.url.urls.indices",
		"user.protected", "user.followers_count", "user.friends_count", "user.listed_count", "user.created_at",
		"user.favourites_count", "user.geo_enabled", "user.verified", "verified", "user.statuses_count",
		"user.contributors_enabled", "user.is_translator", "user.is_translation_enabled",
		"user.profile_background_color", "user.profile_background_image_url", "user.profile_background_image_url_https",
		"user.profile_background_tile", "user.profile_image_url", "user.profile_image_url_https",
		"user.profile_banner_url", "user.profile_link_color", "user.profile_sidebar_border_color",
		"user.profile_sidebar_fill_color", "user.profile_text_color", "user.profile_use_background_image",
		"user.has_extended_profile", "user.default_profile", "user.default_profile_image", "user.can_media_tag",
		"user.followed_by", "user.following", "user.follow_request_sent", "user.notifications", "user.translator_type",
		"is_quote_status", "retweet_count", "favorite_count", "favorited", "retweeted", "possibly_sensitive", "lang",
		"tweet_lang", "sentiment", "_version_", "latitude", "longitude", "state","news_url","news","number_of_articles" })
public class Doc {

	@JsonProperty("created_at")
	private List<String> createdAt = null;
	@JsonProperty("id")
	private String id;
	@JsonProperty("full_text")
	private List<String> fullText = null;
	@JsonProperty("truncated")
	private List<Boolean> truncated = null;
	@JsonProperty("display_text_range")
	private List<Long> displayTextRange = null;
	@JsonProperty("entities.user_mentions.screen_name")
	private List<String> entitiesUserMentionsScreenName = null;
	@JsonProperty("entities.user_mentions.name")
	private List<String> entitiesUserMentionsName = null;
	@JsonProperty("entities.user_mentions.id")
	private List<Long> entitiesUserMentionsId = null;
	@JsonProperty("entities.user_mentions.indices")
	private List<Long> entitiesUserMentionsIndices = null;
	@JsonProperty("entities.urls.url")
	private List<String> entitiesUrlsUrl = null;
	@JsonProperty("entities.urls.expanded_url")
	private List<String> entitiesUrlsExpandedUrl = null;
	@JsonProperty("entities.urls.display_url")
	private List<String> entitiesUrlsDisplayUrl = null;
	@JsonProperty("entities.urls.indices")
	private List<Long> entitiesUrlsIndices = null;
	@JsonProperty("source")
	private List<String> source = null;
	@JsonProperty("user.id")
	private List<Long> userId = null;
	@JsonProperty("poi_id")
	private List<Long> poiId = null;
	@JsonProperty("user.name")
	private List<String> userName = null;
	@JsonProperty("user.screen_name")
	private List<String> userScreenName = null;
	@JsonProperty("poi_name")
	private List<String> poiName = null;
	@JsonProperty("user.location")
	private List<String> userLocation = null;
	@JsonProperty("user.description")
	private List<String> userDescription = null;
	@JsonProperty("user.url")
	private List<String> userUrl = null;
	@JsonProperty("user.entities.url.urls.url")
	private List<String> userEntitiesUrlUrlsUrl = null;
	@JsonProperty("user.entities.url.urls.expanded_url")
	private List<String> userEntitiesUrlUrlsExpandedUrl = null;
	@JsonProperty("user.entities.url.urls.display_url")
	private List<String> userEntitiesUrlUrlsDisplayUrl = null;
	@JsonProperty("user.entities.url.urls.indices")
	private List<Long> userEntitiesUrlUrlsIndices = null;
	@JsonProperty("user.protected")
	private List<Boolean> userProtected = null;
	@JsonProperty("user.followers_count")
	private List<Long> userFollowersCount = null;
	@JsonProperty("user.friends_count")
	private List<Long> userFriendsCount = null;
	@JsonProperty("user.listed_count")
	private List<Long> userListedCount = null;
	@JsonProperty("user.created_at")
	private List<String> userCreatedAt = null;
	@JsonProperty("user.favourites_count")
	private List<Long> userFavouritesCount = null;
	@JsonProperty("user.geo_enabled")
	private List<Boolean> userGeoEnabled = null;
	@JsonProperty("user.verified")
	private List<Boolean> userVerified = null;
	@JsonProperty("verified")
	private List<Boolean> verified = null;
	@JsonProperty("user.statuses_count")
	private List<Long> userStatusesCount = null;
	@JsonProperty("user.contributors_enabled")
	private List<Boolean> userContributorsEnabled = null;
	@JsonProperty("user.is_translator")
	private List<Boolean> userIsTranslator = null;
	@JsonProperty("user.is_translation_enabled")
	private List<Boolean> userIsTranslationEnabled = null;
	@JsonProperty("user.profile_background_color")
	private List<String> userProfileBackgroundColor = null;
	@JsonProperty("user.profile_background_image_url")
	private List<String> userProfileBackgroundImageUrl = null;
	@JsonProperty("user.profile_background_image_url_https")
	private List<String> userProfileBackgroundImageUrlHttps = null;
	@JsonProperty("user.profile_background_tile")
	private List<Boolean> userProfileBackgroundTile = null;
	@JsonProperty("user.profile_image_url")
	private List<String> userProfileImageUrl = null;
	@JsonProperty("user.profile_image_url_https")
	private List<String> userProfileImageUrlHttps = null;
	@JsonProperty("user.profile_banner_url")
	private List<String> userProfileBannerUrl = null;
	@JsonProperty("user.profile_link_color")
	private List<String> userProfileLinkColor = null;
	@JsonProperty("user.profile_sidebar_border_color")
	private List<String> userProfileSidebarBorderColor = null;
	@JsonProperty("user.profile_sidebar_fill_color")
	private List<String> userProfileSidebarFillColor = null;
	@JsonProperty("user.profile_text_color")
	private List<String> userProfileTextColor = null;
	@JsonProperty("user.profile_use_background_image")
	private List<Boolean> userProfileUseBackgroundImage = null;
	@JsonProperty("user.has_extended_profile")
	private List<Boolean> userHasExtendedProfile = null;
	@JsonProperty("user.default_profile")
	private List<Boolean> userDefaultProfile = null;
	@JsonProperty("user.default_profile_image")
	private List<Boolean> userDefaultProfileImage = null;
	@JsonProperty("user.can_media_tag")
	private List<Boolean> userCanMediaTag = null;
	@JsonProperty("user.followed_by")
	private List<Boolean> userFollowedBy = null;
	@JsonProperty("user.following")
	private List<Boolean> userFollowing = null;
	@JsonProperty("user.follow_request_sent")
	private List<Boolean> userFollowRequestSent = null;
	@JsonProperty("user.notifications")
	private List<Boolean> userNotifications = null;
	@JsonProperty("user.translator_type")
	private List<String> userTranslatorType = null;
	@JsonProperty("is_quote_status")
	private List<Boolean> isQuoteStatus = null;
	@JsonProperty("retweet_count")
	private List<Long> retweetCount = null;
	@JsonProperty("favorite_count")
	private List<Long> favoriteCount = null;
	@JsonProperty("favorited")
	private List<Boolean> favorited = null;
	@JsonProperty("retweeted")
	private List<Boolean> retweeted = null;
	@JsonProperty("possibly_sensitive")
	private List<Boolean> possiblySensitive = null;
	@JsonProperty("lang")
	private List<String> lang = null;
	@JsonProperty("tweet_lang")
	private List<String> tweetLang = null;
	@JsonProperty("sentiment")
	private List<String> sentiment = null;
	@JsonProperty("_version_")
	private Long version;
	@JsonProperty("latitude")
	private double latitude;
	@JsonProperty("longitude")
	private double longitude;
	@JsonProperty("state")
	private String state;
	@JsonProperty("news_url")
	private String newsUrl;
	@JsonProperty("news")
	private String news;
	@JsonProperty("number_of_articles")
	private int numberOfArticles;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("news_url")
	public String getNewsUrl() {
		return newsUrl;
	}

	@JsonProperty("news_url")
	public void setNewsUrl(String newsUrl) {
		this.newsUrl = newsUrl;
	}

	@JsonProperty("news")
	public String getNews() {
		return news;
	}

	@JsonProperty("news")
	public void setNews(String news) {
		this.news = news;
	}

	@JsonProperty("number_of_articles")
	public int getNumberOfArticles() {
		return numberOfArticles;
	}

	@JsonProperty("number_of_articles")
	public void setNumberOfArticles(int numberOfArticles) {
		this.numberOfArticles = numberOfArticles;
	}

	@JsonProperty("latitude")
	public double getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@JsonProperty("longitude")
	public double getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("created_at")
	public List<String> getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(List<String> createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("full_text")
	public List<String> getFullText() {
		return fullText;
	}

	@JsonProperty("full_text")
	public void setFullText(List<String> fullText) {
		this.fullText = fullText;
	}

	@JsonProperty("truncated")
	public List<Boolean> getTruncated() {
		return truncated;
	}

	@JsonProperty("truncated")
	public void setTruncated(List<Boolean> truncated) {
		this.truncated = truncated;
	}

	@JsonProperty("display_text_range")
	public List<Long> getDisplayTextRange() {
		return displayTextRange;
	}

	@JsonProperty("display_text_range")
	public void setDisplayTextRange(List<Long> displayTextRange) {
		this.displayTextRange = displayTextRange;
	}

	@JsonProperty("entities.user_mentions.screen_name")
	public List<String> getEntitiesUserMentionsScreenName() {
		return entitiesUserMentionsScreenName;
	}

	@JsonProperty("entities.user_mentions.screen_name")
	public void setEntitiesUserMentionsScreenName(List<String> entitiesUserMentionsScreenName) {
		this.entitiesUserMentionsScreenName = entitiesUserMentionsScreenName;
	}

	@JsonProperty("entities.user_mentions.name")
	public List<String> getEntitiesUserMentionsName() {
		return entitiesUserMentionsName;
	}

	@JsonProperty("entities.user_mentions.name")
	public void setEntitiesUserMentionsName(List<String> entitiesUserMentionsName) {
		this.entitiesUserMentionsName = entitiesUserMentionsName;
	}

	@JsonProperty("entities.user_mentions.id")
	public List<Long> getEntitiesUserMentionsId() {
		return entitiesUserMentionsId;
	}

	@JsonProperty("entities.user_mentions.id")
	public void setEntitiesUserMentionsId(List<Long> entitiesUserMentionsId) {
		this.entitiesUserMentionsId = entitiesUserMentionsId;
	}

	@JsonProperty("entities.user_mentions.indices")
	public List<Long> getEntitiesUserMentionsIndices() {
		return entitiesUserMentionsIndices;
	}

	@JsonProperty("entities.user_mentions.indices")
	public void setEntitiesUserMentionsIndices(List<Long> entitiesUserMentionsIndices) {
		this.entitiesUserMentionsIndices = entitiesUserMentionsIndices;
	}

	@JsonProperty("entities.urls.url")
	public List<String> getEntitiesUrlsUrl() {
		return entitiesUrlsUrl;
	}

	@JsonProperty("entities.urls.url")
	public void setEntitiesUrlsUrl(List<String> entitiesUrlsUrl) {
		this.entitiesUrlsUrl = entitiesUrlsUrl;
	}

	@JsonProperty("entities.urls.expanded_url")
	public List<String> getEntitiesUrlsExpandedUrl() {
		return entitiesUrlsExpandedUrl;
	}

	@JsonProperty("entities.urls.expanded_url")
	public void setEntitiesUrlsExpandedUrl(List<String> entitiesUrlsExpandedUrl) {
		this.entitiesUrlsExpandedUrl = entitiesUrlsExpandedUrl;
	}

	@JsonProperty("entities.urls.display_url")
	public List<String> getEntitiesUrlsDisplayUrl() {
		return entitiesUrlsDisplayUrl;
	}

	@JsonProperty("entities.urls.display_url")
	public void setEntitiesUrlsDisplayUrl(List<String> entitiesUrlsDisplayUrl) {
		this.entitiesUrlsDisplayUrl = entitiesUrlsDisplayUrl;
	}

	@JsonProperty("entities.urls.indices")
	public List<Long> getEntitiesUrlsIndices() {
		return entitiesUrlsIndices;
	}

	@JsonProperty("entities.urls.indices")
	public void setEntitiesUrlsIndices(List<Long> entitiesUrlsIndices) {
		this.entitiesUrlsIndices = entitiesUrlsIndices;
	}

	@JsonProperty("source")
	public List<String> getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(List<String> source) {
		this.source = source;
	}

	@JsonProperty("user.id")
	public List<Long> getUserId() {
		return userId;
	}

	@JsonProperty("user.id")
	public void setUserId(List<Long> userId) {
		this.userId = userId;
	}

	@JsonProperty("poi_id")
	public List<Long> getPoiId() {
		return poiId;
	}

	@JsonProperty("poi_id")
	public void setPoiId(List<Long> poiId) {
		this.poiId = poiId;
	}

	@JsonProperty("user.name")
	public List<String> getUserName() {
		return userName;
	}

	@JsonProperty("user.name")
	public void setUserName(List<String> userName) {
		this.userName = userName;
	}

	@JsonProperty("user.screen_name")
	public List<String> getUserScreenName() {
		return userScreenName;
	}

	@JsonProperty("user.screen_name")
	public void setUserScreenName(List<String> userScreenName) {
		this.userScreenName = userScreenName;
	}

	@JsonProperty("poi_name")
	public List<String> getPoiName() {
		return poiName;
	}

	@JsonProperty("poi_name")
	public void setPoiName(List<String> poiName) {
		this.poiName = poiName;
	}

	@JsonProperty("user.location")
	public List<String> getUserLocation() {
		return userLocation;
	}

	@JsonProperty("user.location")
	public void setUserLocation(List<String> userLocation) {
		this.userLocation = userLocation;
	}

	@JsonProperty("user.description")
	public List<String> getUserDescription() {
		return userDescription;
	}

	@JsonProperty("user.description")
	public void setUserDescription(List<String> userDescription) {
		this.userDescription = userDescription;
	}

	@JsonProperty("user.url")
	public List<String> getUserUrl() {
		return userUrl;
	}

	@JsonProperty("user.url")
	public void setUserUrl(List<String> userUrl) {
		this.userUrl = userUrl;
	}

	@JsonProperty("user.entities.url.urls.url")
	public List<String> getUserEntitiesUrlUrlsUrl() {
		return userEntitiesUrlUrlsUrl;
	}

	@JsonProperty("user.entities.url.urls.url")
	public void setUserEntitiesUrlUrlsUrl(List<String> userEntitiesUrlUrlsUrl) {
		this.userEntitiesUrlUrlsUrl = userEntitiesUrlUrlsUrl;
	}

	@JsonProperty("user.entities.url.urls.expanded_url")
	public List<String> getUserEntitiesUrlUrlsExpandedUrl() {
		return userEntitiesUrlUrlsExpandedUrl;
	}

	@JsonProperty("user.entities.url.urls.expanded_url")
	public void setUserEntitiesUrlUrlsExpandedUrl(List<String> userEntitiesUrlUrlsExpandedUrl) {
		this.userEntitiesUrlUrlsExpandedUrl = userEntitiesUrlUrlsExpandedUrl;
	}

	@JsonProperty("user.entities.url.urls.display_url")
	public List<String> getUserEntitiesUrlUrlsDisplayUrl() {
		return userEntitiesUrlUrlsDisplayUrl;
	}

	@JsonProperty("user.entities.url.urls.display_url")
	public void setUserEntitiesUrlUrlsDisplayUrl(List<String> userEntitiesUrlUrlsDisplayUrl) {
		this.userEntitiesUrlUrlsDisplayUrl = userEntitiesUrlUrlsDisplayUrl;
	}

	@JsonProperty("user.entities.url.urls.indices")
	public List<Long> getUserEntitiesUrlUrlsIndices() {
		return userEntitiesUrlUrlsIndices;
	}

	@JsonProperty("user.entities.url.urls.indices")
	public void setUserEntitiesUrlUrlsIndices(List<Long> userEntitiesUrlUrlsIndices) {
		this.userEntitiesUrlUrlsIndices = userEntitiesUrlUrlsIndices;
	}

	@JsonProperty("user.protected")
	public List<Boolean> getUserProtected() {
		return userProtected;
	}

	@JsonProperty("user.protected")
	public void setUserProtected(List<Boolean> userProtected) {
		this.userProtected = userProtected;
	}

	@JsonProperty("user.followers_count")
	public List<Long> getUserFollowersCount() {
		return userFollowersCount;
	}

	@JsonProperty("user.followers_count")
	public void setUserFollowersCount(List<Long> userFollowersCount) {
		this.userFollowersCount = userFollowersCount;
	}

	@JsonProperty("user.friends_count")
	public List<Long> getUserFriendsCount() {
		return userFriendsCount;
	}

	@JsonProperty("user.friends_count")
	public void setUserFriendsCount(List<Long> userFriendsCount) {
		this.userFriendsCount = userFriendsCount;
	}

	@JsonProperty("user.listed_count")
	public List<Long> getUserListedCount() {
		return userListedCount;
	}

	@JsonProperty("user.listed_count")
	public void setUserListedCount(List<Long> userListedCount) {
		this.userListedCount = userListedCount;
	}

	@JsonProperty("user.created_at")
	public List<String> getUserCreatedAt() {
		return userCreatedAt;
	}

	@JsonProperty("user.created_at")
	public void setUserCreatedAt(List<String> userCreatedAt) {
		this.userCreatedAt = userCreatedAt;
	}

	@JsonProperty("user.favourites_count")
	public List<Long> getUserFavouritesCount() {
		return userFavouritesCount;
	}

	@JsonProperty("user.favourites_count")
	public void setUserFavouritesCount(List<Long> userFavouritesCount) {
		this.userFavouritesCount = userFavouritesCount;
	}

	@JsonProperty("user.geo_enabled")
	public List<Boolean> getUserGeoEnabled() {
		return userGeoEnabled;
	}

	@JsonProperty("user.geo_enabled")
	public void setUserGeoEnabled(List<Boolean> userGeoEnabled) {
		this.userGeoEnabled = userGeoEnabled;
	}

	@JsonProperty("user.verified")
	public List<Boolean> getUserVerified() {
		return userVerified;
	}

	@JsonProperty("user.verified")
	public void setUserVerified(List<Boolean> userVerified) {
		this.userVerified = userVerified;
	}

	@JsonProperty("verified")
	public List<Boolean> getVerified() {
		return verified;
	}

	@JsonProperty("verified")
	public void setVerified(List<Boolean> verified) {
		this.verified = verified;
	}

	@JsonProperty("user.statuses_count")
	public List<Long> getUserStatusesCount() {
		return userStatusesCount;
	}

	@JsonProperty("user.statuses_count")
	public void setUserStatusesCount(List<Long> userStatusesCount) {
		this.userStatusesCount = userStatusesCount;
	}

	@JsonProperty("user.contributors_enabled")
	public List<Boolean> getUserContributorsEnabled() {
		return userContributorsEnabled;
	}

	@JsonProperty("user.contributors_enabled")
	public void setUserContributorsEnabled(List<Boolean> userContributorsEnabled) {
		this.userContributorsEnabled = userContributorsEnabled;
	}

	@JsonProperty("user.is_translator")
	public List<Boolean> getUserIsTranslator() {
		return userIsTranslator;
	}

	@JsonProperty("user.is_translator")
	public void setUserIsTranslator(List<Boolean> userIsTranslator) {
		this.userIsTranslator = userIsTranslator;
	}

	@JsonProperty("user.is_translation_enabled")
	public List<Boolean> getUserIsTranslationEnabled() {
		return userIsTranslationEnabled;
	}

	@JsonProperty("user.is_translation_enabled")
	public void setUserIsTranslationEnabled(List<Boolean> userIsTranslationEnabled) {
		this.userIsTranslationEnabled = userIsTranslationEnabled;
	}

	@JsonProperty("user.profile_background_color")
	public List<String> getUserProfileBackgroundColor() {
		return userProfileBackgroundColor;
	}

	@JsonProperty("user.profile_background_color")
	public void setUserProfileBackgroundColor(List<String> userProfileBackgroundColor) {
		this.userProfileBackgroundColor = userProfileBackgroundColor;
	}

	@JsonProperty("user.profile_background_image_url")
	public List<String> getUserProfileBackgroundImageUrl() {
		return userProfileBackgroundImageUrl;
	}

	@JsonProperty("user.profile_background_image_url")
	public void setUserProfileBackgroundImageUrl(List<String> userProfileBackgroundImageUrl) {
		this.userProfileBackgroundImageUrl = userProfileBackgroundImageUrl;
	}

	@JsonProperty("user.profile_background_image_url_https")
	public List<String> getUserProfileBackgroundImageUrlHttps() {
		return userProfileBackgroundImageUrlHttps;
	}

	@JsonProperty("user.profile_background_image_url_https")
	public void setUserProfileBackgroundImageUrlHttps(List<String> userProfileBackgroundImageUrlHttps) {
		this.userProfileBackgroundImageUrlHttps = userProfileBackgroundImageUrlHttps;
	}

	@JsonProperty("user.profile_background_tile")
	public List<Boolean> getUserProfileBackgroundTile() {
		return userProfileBackgroundTile;
	}

	@JsonProperty("user.profile_background_tile")
	public void setUserProfileBackgroundTile(List<Boolean> userProfileBackgroundTile) {
		this.userProfileBackgroundTile = userProfileBackgroundTile;
	}

	@JsonProperty("user.profile_image_url")
	public List<String> getUserProfileImageUrl() {
		return userProfileImageUrl;
	}

	@JsonProperty("user.profile_image_url")
	public void setUserProfileImageUrl(List<String> userProfileImageUrl) {
		this.userProfileImageUrl = userProfileImageUrl;
	}

	@JsonProperty("user.profile_image_url_https")
	public List<String> getUserProfileImageUrlHttps() {
		return userProfileImageUrlHttps;
	}

	@JsonProperty("user.profile_image_url_https")
	public void setUserProfileImageUrlHttps(List<String> userProfileImageUrlHttps) {
		this.userProfileImageUrlHttps = userProfileImageUrlHttps;
	}

	@JsonProperty("user.profile_banner_url")
	public List<String> getUserProfileBannerUrl() {
		return userProfileBannerUrl;
	}

	@JsonProperty("user.profile_banner_url")
	public void setUserProfileBannerUrl(List<String> userProfileBannerUrl) {
		this.userProfileBannerUrl = userProfileBannerUrl;
	}

	@JsonProperty("user.profile_link_color")
	public List<String> getUserProfileLinkColor() {
		return userProfileLinkColor;
	}

	@JsonProperty("user.profile_link_color")
	public void setUserProfileLinkColor(List<String> userProfileLinkColor) {
		this.userProfileLinkColor = userProfileLinkColor;
	}

	@JsonProperty("user.profile_sidebar_border_color")
	public List<String> getUserProfileSidebarBorderColor() {
		return userProfileSidebarBorderColor;
	}

	@JsonProperty("user.profile_sidebar_border_color")
	public void setUserProfileSidebarBorderColor(List<String> userProfileSidebarBorderColor) {
		this.userProfileSidebarBorderColor = userProfileSidebarBorderColor;
	}

	@JsonProperty("user.profile_sidebar_fill_color")
	public List<String> getUserProfileSidebarFillColor() {
		return userProfileSidebarFillColor;
	}

	@JsonProperty("user.profile_sidebar_fill_color")
	public void setUserProfileSidebarFillColor(List<String> userProfileSidebarFillColor) {
		this.userProfileSidebarFillColor = userProfileSidebarFillColor;
	}

	@JsonProperty("user.profile_text_color")
	public List<String> getUserProfileTextColor() {
		return userProfileTextColor;
	}

	@JsonProperty("user.profile_text_color")
	public void setUserProfileTextColor(List<String> userProfileTextColor) {
		this.userProfileTextColor = userProfileTextColor;
	}

	@JsonProperty("user.profile_use_background_image")
	public List<Boolean> getUserProfileUseBackgroundImage() {
		return userProfileUseBackgroundImage;
	}

	@JsonProperty("user.profile_use_background_image")
	public void setUserProfileUseBackgroundImage(List<Boolean> userProfileUseBackgroundImage) {
		this.userProfileUseBackgroundImage = userProfileUseBackgroundImage;
	}

	@JsonProperty("user.has_extended_profile")
	public List<Boolean> getUserHasExtendedProfile() {
		return userHasExtendedProfile;
	}

	@JsonProperty("user.has_extended_profile")
	public void setUserHasExtendedProfile(List<Boolean> userHasExtendedProfile) {
		this.userHasExtendedProfile = userHasExtendedProfile;
	}

	@JsonProperty("user.default_profile")
	public List<Boolean> getUserDefaultProfile() {
		return userDefaultProfile;
	}

	@JsonProperty("user.default_profile")
	public void setUserDefaultProfile(List<Boolean> userDefaultProfile) {
		this.userDefaultProfile = userDefaultProfile;
	}

	@JsonProperty("user.default_profile_image")
	public List<Boolean> getUserDefaultProfileImage() {
		return userDefaultProfileImage;
	}

	@JsonProperty("user.default_profile_image")
	public void setUserDefaultProfileImage(List<Boolean> userDefaultProfileImage) {
		this.userDefaultProfileImage = userDefaultProfileImage;
	}

	@JsonProperty("user.can_media_tag")
	public List<Boolean> getUserCanMediaTag() {
		return userCanMediaTag;
	}

	@JsonProperty("user.can_media_tag")
	public void setUserCanMediaTag(List<Boolean> userCanMediaTag) {
		this.userCanMediaTag = userCanMediaTag;
	}

	@JsonProperty("user.followed_by")
	public List<Boolean> getUserFollowedBy() {
		return userFollowedBy;
	}

	@JsonProperty("user.followed_by")
	public void setUserFollowedBy(List<Boolean> userFollowedBy) {
		this.userFollowedBy = userFollowedBy;
	}

	@JsonProperty("user.following")
	public List<Boolean> getUserFollowing() {
		return userFollowing;
	}

	@JsonProperty("user.following")
	public void setUserFollowing(List<Boolean> userFollowing) {
		this.userFollowing = userFollowing;
	}

	@JsonProperty("user.follow_request_sent")
	public List<Boolean> getUserFollowRequestSent() {
		return userFollowRequestSent;
	}

	@JsonProperty("user.follow_request_sent")
	public void setUserFollowRequestSent(List<Boolean> userFollowRequestSent) {
		this.userFollowRequestSent = userFollowRequestSent;
	}

	@JsonProperty("user.notifications")
	public List<Boolean> getUserNotifications() {
		return userNotifications;
	}

	@JsonProperty("user.notifications")
	public void setUserNotifications(List<Boolean> userNotifications) {
		this.userNotifications = userNotifications;
	}

	@JsonProperty("user.translator_type")
	public List<String> getUserTranslatorType() {
		return userTranslatorType;
	}

	@JsonProperty("user.translator_type")
	public void setUserTranslatorType(List<String> userTranslatorType) {
		this.userTranslatorType = userTranslatorType;
	}

	@JsonProperty("is_quote_status")
	public List<Boolean> getIsQuoteStatus() {
		return isQuoteStatus;
	}

	@JsonProperty("is_quote_status")
	public void setIsQuoteStatus(List<Boolean> isQuoteStatus) {
		this.isQuoteStatus = isQuoteStatus;
	}

	@JsonProperty("retweet_count")
	public List<Long> getRetweetCount() {
		return retweetCount;
	}

	@JsonProperty("retweet_count")
	public void setRetweetCount(List<Long> retweetCount) {
		this.retweetCount = retweetCount;
	}

	@JsonProperty("favorite_count")
	public List<Long> getFavoriteCount() {
		return favoriteCount;
	}

	@JsonProperty("favorite_count")
	public void setFavoriteCount(List<Long> favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	@JsonProperty("favorited")
	public List<Boolean> getFavorited() {
		return favorited;
	}

	@JsonProperty("favorited")
	public void setFavorited(List<Boolean> favorited) {
		this.favorited = favorited;
	}

	@JsonProperty("retweeted")
	public List<Boolean> getRetweeted() {
		return retweeted;
	}

	@JsonProperty("retweeted")
	public void setRetweeted(List<Boolean> retweeted) {
		this.retweeted = retweeted;
	}

	@JsonProperty("possibly_sensitive")
	public List<Boolean> getPossiblySensitive() {
		return possiblySensitive;
	}

	@JsonProperty("possibly_sensitive")
	public void setPossiblySensitive(List<Boolean> possiblySensitive) {
		this.possiblySensitive = possiblySensitive;
	}

	@JsonProperty("lang")
	public List<String> getLang() {
		return lang;
	}

	@JsonProperty("lang")
	public void setLang(List<String> lang) {
		this.lang = lang;
	}

	@JsonProperty("tweet_lang")
	public List<String> getTweetLang() {
		return tweetLang;
	}

	@JsonProperty("tweet_lang")
	public void setTweetLang(List<String> tweetLang) {
		this.tweetLang = tweetLang;
	}

	@JsonProperty("sentiment")
	public List<String> getSentiment() {
		return sentiment;
	}

	@JsonProperty("sentiment")
	public void setSentiment(List<String> sentiment) {
		this.sentiment = sentiment;
	}

	@JsonProperty("_version_")
	public Long getVersion() {
		return version;
	}

	@JsonProperty("_version_")
	public void setVersion(Long version) {
		this.version = version;
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