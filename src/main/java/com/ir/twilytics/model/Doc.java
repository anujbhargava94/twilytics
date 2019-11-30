
package com.ir.twilytics.model;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Service
public class Doc {

	 @SerializedName("poi_name")
	    @Expose
	    private List<String> poiName = null;
	    @SerializedName("poi_id")
	    @Expose
	    private List<BigInteger> poiId = null;
	    @SerializedName("verified")
	    @Expose
	    private List<Boolean> verified = null;
	    @SerializedName("country")
	    @Expose
	    private List<String> country = null;
	    @SerializedName("replied_to_tweet_id")
	    @Expose
	    private List<BigInteger> repliedToTweetId = null;
	    @SerializedName("replied_to_user_id")
	    @Expose
	    private List<BigInteger> repliedToUserId = null;
	    @SerializedName("reply_text")
	    @Expose
	    private List<String> replyText = null;
	    @SerializedName("tweet_text")
	    @Expose
	    private List<String> tweetText = null;
	    @SerializedName("tweet_lang")
	    @Expose
	    private List<String> tweetLang = null;
	    @SerializedName("mentions")
	    @Expose
	    private List<String> mentions = null;
	    @SerializedName("tweet_date")
	    @Expose
	    private List<String> tweetDate = null;
	    @SerializedName("text_en")
	    @Expose
	    private String textEn;
	    @SerializedName("created_at")
	    @Expose
	    private List<String> createdAt = null;
	    @SerializedName("id")
	    @Expose
	    private String id;
	    @SerializedName("full_text")
	    @Expose
	    private List<String> fullText = null;
	    @SerializedName("truncated")
	    @Expose
	    private List<Boolean> truncated = null;
	    @SerializedName("display_text_range")
	    @Expose
	    private List<BigInteger> displayTextRange = null;
	    @SerializedName("entities.user_mentions.screen_name")
	    @Expose
	    private List<String> entitiesUserMentionsScreenName = null;
	    @SerializedName("entities.user_mentions.name")
	    @Expose
	    private List<String> entitiesUserMentionsName = null;
	    @SerializedName("entities.user_mentions.id")
	    @Expose
	    private List<BigInteger> entitiesUserMentionsId = null;
	    @SerializedName("entities.user_mentions.indices")
	    @Expose
	    private List<BigInteger> entitiesUserMentionsIndices = null;
	    @SerializedName("metadata.iso_language_code")
	    @Expose
	    private List<String> metadataIsoLanguageCode = null;
	    @SerializedName("metadata.result_type")
	    @Expose
	    private List<String> metadataResultType = null;
	    @SerializedName("source")
	    @Expose
	    private List<String> source = null;
	    @SerializedName("in_reply_to_status_id")
	    @Expose
	    private List<BigInteger> inReplyToStatusId = null;
	    @SerializedName("in_reply_to_user_id")
	    @Expose
	    private List<BigInteger> inReplyToUserId = null;
	    @SerializedName("in_reply_to_screen_name")
	    @Expose
	    private List<String> inReplyToScreenName = null;
	    @SerializedName("user.id")
	    @Expose
	    private List<BigInteger> userId = null;
	    @SerializedName("user.name")
	    @Expose
	    private List<String> userName = null;
	    @SerializedName("user.screen_name")
	    @Expose
	    private List<String> userScreenName = null;
	    @SerializedName("user.description")
	    @Expose
	    private List<String> userDescription = null;
	    @SerializedName("user.protected")
	    @Expose
	    private List<Boolean> userProtected = null;
	    @SerializedName("user.followers_count")
	    @Expose
	    private List<BigInteger> userFollowersCount = null;
	    @SerializedName("user.friends_count")
	    @Expose
	    private List<BigInteger> userFriendsCount = null;
	    @SerializedName("user.listed_count")
	    @Expose
	    private List<BigInteger> userListedCount = null;
	    @SerializedName("user.created_at")
	    @Expose
	    private List<String> userCreatedAt = null;
	    @SerializedName("user.favourites_count")
	    @Expose
	    private List<BigInteger> userFavouritesCount = null;
	    @SerializedName("user.geo_enabled")
	    @Expose
	    private List<Boolean> userGeoEnabled = null;
	    @SerializedName("user.verified")
	    @Expose
	    private List<Boolean> userVerified = null;
	    @SerializedName("user.statuses_count")
	    @Expose
	    private List<BigInteger> userStatusesCount = null;
	    @SerializedName("user.contributors_enabled")
	    @Expose
	    private List<Boolean> userContributorsEnabled = null;
	    @SerializedName("user.is_translator")
	    @Expose
	    private List<Boolean> userIsTranslator = null;
	    @SerializedName("user.is_translation_enabled")
	    @Expose
	    private List<Boolean> userIsTranslationEnabled = null;
	    @SerializedName("user.profile_background_color")
	    @Expose
	    private List<String> userProfileBackgroundColor = null;
	    @SerializedName("user.profile_background_image_url")
	    @Expose
	    private List<String> userProfileBackgroundImageUrl = null;
	    @SerializedName("user.profile_background_image_url_https")
	    @Expose
	    private List<String> userProfileBackgroundImageUrlHttps = null;
	    @SerializedName("user.profile_background_tile")
	    @Expose
	    private List<Boolean> userProfileBackgroundTile = null;
	    @SerializedName("user.profile_image_url")
	    @Expose
	    private List<String> userProfileImageUrl = null;
	    @SerializedName("user.profile_image_url_https")
	    @Expose
	    private List<String> userProfileImageUrlHttps = null;
	    @SerializedName("user.profile_banner_url")
	    @Expose
	    private List<String> userProfileBannerUrl = null;
	    @SerializedName("user.profile_link_color")
	    @Expose
	    private List<String> userProfileLinkColor = null;
	    @SerializedName("user.profile_sidebar_border_color")
	    @Expose
	    private List<String> userProfileSidebarBorderColor = null;
	    @SerializedName("user.profile_sidebar_fill_color")
	    @Expose
	    private List<String> userProfileSidebarFillColor = null;
	    @SerializedName("user.profile_text_color")
	    @Expose
	    private List<String> userProfileTextColor = null;
	    @SerializedName("user.profile_use_background_image")
	    @Expose
	    private List<Boolean> userProfileUseBackgroundImage = null;
	    @SerializedName("user.has_extended_profile")
	    @Expose
	    private List<Boolean> userHasExtendedProfile = null;
	    @SerializedName("user.default_profile")
	    @Expose
	    private List<Boolean> userDefaultProfile = null;
	    @SerializedName("user.default_profile_image")
	    @Expose
	    private List<Boolean> userDefaultProfileImage = null;
	    @SerializedName("user.following")
	    @Expose
	    private List<Boolean> userFollowing = null;
	    @SerializedName("user.follow_request_sent")
	    @Expose
	    private List<Boolean> userFollowRequestSent = null;
	    @SerializedName("user.notifications")
	    @Expose
	    private List<Boolean> userNotifications = null;
	    @SerializedName("user.translator_type")
	    @Expose
	    private List<String> userTranslatorType = null;
	    @SerializedName("is_quote_status")
	    @Expose
	    private List<Boolean> isQuoteStatus = null;
	    @SerializedName("retweet_count")
	    @Expose
	    private List<BigInteger> retweetCount = null;
	    @SerializedName("favorite_count")
	    @Expose
	    private List<BigInteger> favoriteCount = null;
	    @SerializedName("favorited")
	    @Expose
	    private List<Boolean> favorited = null;
	    @SerializedName("retweeted")
	    @Expose
	    private List<Boolean> retweeted = null;
	    @SerializedName("lang")
	    @Expose
	    private List<String> lang = null;
	    
	    @SerializedName("user.location")
	    @Expose
	    private List<String> userLocation = null;

	    public List<String> getUserLocation() {
			return userLocation;
		}

		public void setUserLocation(List<String> userLocation) {
			this.userLocation = userLocation;
		}
		
	    @SerializedName("sentiment")
	    @Expose
	    private List<String> sentiment = null;

		public List<String> getPoiName() {
	        return poiName;
	    }

	    public void setPoiName(List<String> poiName) {
	        this.poiName = poiName;
	    }

	    public List<String> getSentiment() {
			return sentiment;
		}

		public void setSentiment(List<String> sentiment) {
			this.sentiment = sentiment;
		}

		public List<BigInteger> getPoiId() {
	        return poiId;
	    }

	    public void setPoiId(List<BigInteger> poiId) {
	        this.poiId = poiId;
	    }

	    public List<Boolean> getVerified() {
	        return verified;
	    }

	    public void setVerified(List<Boolean> verified) {
	        this.verified = verified;
	    }

	    public List<String> getCountry() {
	        return country;
	    }

	    public void setCountry(List<String> country) {
	        this.country = country;
	    }

	    public List<BigInteger> getRepliedToTweetId() {
	        return repliedToTweetId;
	    }

	    public void setRepliedToTweetId(List<BigInteger> repliedToTweetId) {
	        this.repliedToTweetId = repliedToTweetId;
	    }

	    public List<BigInteger> getRepliedToUserId() {
	        return repliedToUserId;
	    }

	    public void setRepliedToUserId(List<BigInteger> repliedToUserId) {
	        this.repliedToUserId = repliedToUserId;
	    }

	    public List<String> getReplyText() {
	        return replyText;
	    }

	    public void setReplyText(List<String> replyText) {
	        this.replyText = replyText;
	    }

	    public List<String> getTweetText() {
	        return tweetText;
	    }

	    public void setTweetText(List<String> tweetText) {
	        this.tweetText = tweetText;
	    }

	    public List<String> getTweetLang() {
	        return tweetLang;
	    }

	    public void setTweetLang(List<String> tweetLang) {
	        this.tweetLang = tweetLang;
	    }

	    public List<String> getMentions() {
	        return mentions;
	    }

	    public void setMentions(List<String> mentions) {
	        this.mentions = mentions;
	    }

	    public List<String> getTweetDate() {
	        return tweetDate;
	    }

	    public void setTweetDate(List<String> tweetDate) {
	        this.tweetDate = tweetDate;
	    }

	    public String getTextEn() {
	        return textEn;
	    }

	    public void setTextEn(String textEn) {
	        this.textEn = textEn;
	    }

	    public List<String> getCreatedAt() {
	        return createdAt;
	    }

	    public void setCreatedAt(List<String> createdAt) {
	        this.createdAt = createdAt;
	    }

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public List<String> getFullText() {
	        return fullText;
	    }

	    public void setFullText(List<String> fullText) {
	        this.fullText = fullText;
	    }

	    public List<Boolean> getTruncated() {
	        return truncated;
	    }

	    public void setTruncated(List<Boolean> truncated) {
	        this.truncated = truncated;
	    }

	    public List<BigInteger> getDisplayTextRange() {
	        return displayTextRange;
	    }

	    public void setDisplayTextRange(List<BigInteger> displayTextRange) {
	        this.displayTextRange = displayTextRange;
	    }

	    public List<String> getEntitiesUserMentionsScreenName() {
	        return entitiesUserMentionsScreenName;
	    }

	    public void setEntitiesUserMentionsScreenName(List<String> entitiesUserMentionsScreenName) {
	        this.entitiesUserMentionsScreenName = entitiesUserMentionsScreenName;
	    }

	    public List<String> getEntitiesUserMentionsName() {
	        return entitiesUserMentionsName;
	    }

	    public void setEntitiesUserMentionsName(List<String> entitiesUserMentionsName) {
	        this.entitiesUserMentionsName = entitiesUserMentionsName;
	    }

	    public List<BigInteger> getEntitiesUserMentionsId() {
	        return entitiesUserMentionsId;
	    }

	    public void setEntitiesUserMentionsId(List<BigInteger> entitiesUserMentionsId) {
	        this.entitiesUserMentionsId = entitiesUserMentionsId;
	    }

	    public List<BigInteger> getEntitiesUserMentionsIndices() {
	        return entitiesUserMentionsIndices;
	    }

	    public void setEntitiesUserMentionsIndices(List<BigInteger> entitiesUserMentionsIndices) {
	        this.entitiesUserMentionsIndices = entitiesUserMentionsIndices;
	    }

	    public List<String> getMetadataIsoLanguageCode() {
	        return metadataIsoLanguageCode;
	    }

	    public void setMetadataIsoLanguageCode(List<String> metadataIsoLanguageCode) {
	        this.metadataIsoLanguageCode = metadataIsoLanguageCode;
	    }

	    public List<String> getMetadataResultType() {
	        return metadataResultType;
	    }

	    public void setMetadataResultType(List<String> metadataResultType) {
	        this.metadataResultType = metadataResultType;
	    }

	    public List<String> getSource() {
	        return source;
	    }

	    public void setSource(List<String> source) {
	        this.source = source;
	    }

	    public List<BigInteger> getInReplyToStatusId() {
	        return inReplyToStatusId;
	    }

	    public void setInReplyToStatusId(List<BigInteger> inReplyToStatusId) {
	        this.inReplyToStatusId = inReplyToStatusId;
	    }

	    public List<BigInteger> getInReplyToUserId() {
	        return inReplyToUserId;
	    }

	    public void setInReplyToUserId(List<BigInteger> inReplyToUserId) {
	        this.inReplyToUserId = inReplyToUserId;
	    }

	    public List<String> getInReplyToScreenName() {
	        return inReplyToScreenName;
	    }

	    public void setInReplyToScreenName(List<String> inReplyToScreenName) {
	        this.inReplyToScreenName = inReplyToScreenName;
	    }

	    public List<BigInteger> getUserId() {
	        return userId;
	    }

	    public void setUserId(List<BigInteger> userId) {
	        this.userId = userId;
	    }

	    public List<String> getUserName() {
	        return userName;
	    }

	    public void setUserName(List<String> userName) {
	        this.userName = userName;
	    }

	    public List<String> getUserScreenName() {
	        return userScreenName;
	    }

	    public void setUserScreenName(List<String> userScreenName) {
	        this.userScreenName = userScreenName;
	    }

	    public List<String> getUserDescription() {
	        return userDescription;
	    }

	    public void setUserDescription(List<String> userDescription) {
	        this.userDescription = userDescription;
	    }

	    public List<Boolean> getUserProtected() {
	        return userProtected;
	    }

	    public void setUserProtected(List<Boolean> userProtected) {
	        this.userProtected = userProtected;
	    }

	    public List<BigInteger> getUserFollowersCount() {
	        return userFollowersCount;
	    }

	    public void setUserFollowersCount(List<BigInteger> userFollowersCount) {
	        this.userFollowersCount = userFollowersCount;
	    }

	    public List<BigInteger> getUserFriendsCount() {
	        return userFriendsCount;
	    }

	    public void setUserFriendsCount(List<BigInteger> userFriendsCount) {
	        this.userFriendsCount = userFriendsCount;
	    }

	    public List<BigInteger> getUserListedCount() {
	        return userListedCount;
	    }

	    public void setUserListedCount(List<BigInteger> userListedCount) {
	        this.userListedCount = userListedCount;
	    }

	    public List<String> getUserCreatedAt() {
	        return userCreatedAt;
	    }

	    public void setUserCreatedAt(List<String> userCreatedAt) {
	        this.userCreatedAt = userCreatedAt;
	    }

	    public List<BigInteger> getUserFavouritesCount() {
	        return userFavouritesCount;
	    }

	    public void setUserFavouritesCount(List<BigInteger> userFavouritesCount) {
	        this.userFavouritesCount = userFavouritesCount;
	    }

	    public List<Boolean> getUserGeoEnabled() {
	        return userGeoEnabled;
	    }

	    public void setUserGeoEnabled(List<Boolean> userGeoEnabled) {
	        this.userGeoEnabled = userGeoEnabled;
	    }

	    public List<Boolean> getUserVerified() {
	        return userVerified;
	    }

	    public void setUserVerified(List<Boolean> userVerified) {
	        this.userVerified = userVerified;
	    }

	    public List<BigInteger> getUserStatusesCount() {
	        return userStatusesCount;
	    }

	    public void setUserStatusesCount(List<BigInteger> userStatusesCount) {
	        this.userStatusesCount = userStatusesCount;
	    }

	    public List<Boolean> getUserContributorsEnabled() {
	        return userContributorsEnabled;
	    }

	    public void setUserContributorsEnabled(List<Boolean> userContributorsEnabled) {
	        this.userContributorsEnabled = userContributorsEnabled;
	    }

	    public List<Boolean> getUserIsTranslator() {
	        return userIsTranslator;
	    }

	    public void setUserIsTranslator(List<Boolean> userIsTranslator) {
	        this.userIsTranslator = userIsTranslator;
	    }

	    public List<Boolean> getUserIsTranslationEnabled() {
	        return userIsTranslationEnabled;
	    }

	    public void setUserIsTranslationEnabled(List<Boolean> userIsTranslationEnabled) {
	        this.userIsTranslationEnabled = userIsTranslationEnabled;
	    }

	    public List<String> getUserProfileBackgroundColor() {
	        return userProfileBackgroundColor;
	    }

	    public void setUserProfileBackgroundColor(List<String> userProfileBackgroundColor) {
	        this.userProfileBackgroundColor = userProfileBackgroundColor;
	    }

	    public List<String> getUserProfileBackgroundImageUrl() {
	        return userProfileBackgroundImageUrl;
	    }

	    public void setUserProfileBackgroundImageUrl(List<String> userProfileBackgroundImageUrl) {
	        this.userProfileBackgroundImageUrl = userProfileBackgroundImageUrl;
	    }

	    public List<String> getUserProfileBackgroundImageUrlHttps() {
	        return userProfileBackgroundImageUrlHttps;
	    }

	    public void setUserProfileBackgroundImageUrlHttps(List<String> userProfileBackgroundImageUrlHttps) {
	        this.userProfileBackgroundImageUrlHttps = userProfileBackgroundImageUrlHttps;
	    }

	    public List<Boolean> getUserProfileBackgroundTile() {
	        return userProfileBackgroundTile;
	    }

	    public void setUserProfileBackgroundTile(List<Boolean> userProfileBackgroundTile) {
	        this.userProfileBackgroundTile = userProfileBackgroundTile;
	    }

	    public List<String> getUserProfileImageUrl() {
	        return userProfileImageUrl;
	    }

	    public void setUserProfileImageUrl(List<String> userProfileImageUrl) {
	        this.userProfileImageUrl = userProfileImageUrl;
	    }

	    public List<String> getUserProfileImageUrlHttps() {
	        return userProfileImageUrlHttps;
	    }

	    public void setUserProfileImageUrlHttps(List<String> userProfileImageUrlHttps) {
	        this.userProfileImageUrlHttps = userProfileImageUrlHttps;
	    }

	    public List<String> getUserProfileBannerUrl() {
	        return userProfileBannerUrl;
	    }

	    public void setUserProfileBannerUrl(List<String> userProfileBannerUrl) {
	        this.userProfileBannerUrl = userProfileBannerUrl;
	    }

	    public List<String> getUserProfileLinkColor() {
	        return userProfileLinkColor;
	    }

	    public void setUserProfileLinkColor(List<String> userProfileLinkColor) {
	        this.userProfileLinkColor = userProfileLinkColor;
	    }

	    public List<String> getUserProfileSidebarBorderColor() {
	        return userProfileSidebarBorderColor;
	    }

	    public void setUserProfileSidebarBorderColor(List<String> userProfileSidebarBorderColor) {
	        this.userProfileSidebarBorderColor = userProfileSidebarBorderColor;
	    }

	    public List<String> getUserProfileSidebarFillColor() {
	        return userProfileSidebarFillColor;
	    }

	    public void setUserProfileSidebarFillColor(List<String> userProfileSidebarFillColor) {
	        this.userProfileSidebarFillColor = userProfileSidebarFillColor;
	    }

	    public List<String> getUserProfileTextColor() {
	        return userProfileTextColor;
	    }

	    public void setUserProfileTextColor(List<String> userProfileTextColor) {
	        this.userProfileTextColor = userProfileTextColor;
	    }

	    public List<Boolean> getUserProfileUseBackgroundImage() {
	        return userProfileUseBackgroundImage;
	    }

	    public void setUserProfileUseBackgroundImage(List<Boolean> userProfileUseBackgroundImage) {
	        this.userProfileUseBackgroundImage = userProfileUseBackgroundImage;
	    }

	    public List<Boolean> getUserHasExtendedProfile() {
	        return userHasExtendedProfile;
	    }

	    public void setUserHasExtendedProfile(List<Boolean> userHasExtendedProfile) {
	        this.userHasExtendedProfile = userHasExtendedProfile;
	    }

	    public List<Boolean> getUserDefaultProfile() {
	        return userDefaultProfile;
	    }

	    public void setUserDefaultProfile(List<Boolean> userDefaultProfile) {
	        this.userDefaultProfile = userDefaultProfile;
	    }

	    public List<Boolean> getUserDefaultProfileImage() {
	        return userDefaultProfileImage;
	    }

	    public void setUserDefaultProfileImage(List<Boolean> userDefaultProfileImage) {
	        this.userDefaultProfileImage = userDefaultProfileImage;
	    }

	    public List<Boolean> getUserFollowing() {
	        return userFollowing;
	    }

	    public void setUserFollowing(List<Boolean> userFollowing) {
	        this.userFollowing = userFollowing;
	    }

	    public List<Boolean> getUserFollowRequestSent() {
	        return userFollowRequestSent;
	    }

	    public void setUserFollowRequestSent(List<Boolean> userFollowRequestSent) {
	        this.userFollowRequestSent = userFollowRequestSent;
	    }

	    public List<Boolean> getUserNotifications() {
	        return userNotifications;
	    }

	    public void setUserNotifications(List<Boolean> userNotifications) {
	        this.userNotifications = userNotifications;
	    }

	    public List<String> getUserTranslatorType() {
	        return userTranslatorType;
	    }

	    public void setUserTranslatorType(List<String> userTranslatorType) {
	        this.userTranslatorType = userTranslatorType;
	    }

	    public List<Boolean> getIsQuoteStatus() {
	        return isQuoteStatus;
	    }

	    public void setIsQuoteStatus(List<Boolean> isQuoteStatus) {
	        this.isQuoteStatus = isQuoteStatus;
	    }

	    public List<BigInteger> getRetweetCount() {
	        return retweetCount;
	    }

	    public void setRetweetCount(List<BigInteger> retweetCount) {
	        this.retweetCount = retweetCount;
	    }

	    public List<BigInteger> getFavoriteCount() {
	        return favoriteCount;
	    }

	    public void setFavoriteCount(List<BigInteger> favoriteCount) {
	        this.favoriteCount = favoriteCount;
	    }

	    public List<Boolean> getFavorited() {
	        return favorited;
	    }

	    public void setFavorited(List<Boolean> favorited) {
	        this.favorited = favorited;
	    }

	    public List<Boolean> getRetweeted() {
	        return retweeted;
	    }

	    public void setRetweeted(List<Boolean> retweeted) {
	        this.retweeted = retweeted;
	    }

	    public List<String> getLang() {
	        return lang;
	    }

	    public void setLang(List<String> lang) {
	        this.lang = lang;
	    }

}
