package io.spring.application.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class ArticleData {
    private String id;
    private String slug;
    private String title;
    private String description;
    private String body;
    private boolean favorited;
    private int favoritesCount;
    private Instant createdAt;
    private Instant updatedAt;
    private List<String> tagList;
    @JsonProperty("author")
    private ProfileData profileData;

    public ArticleData() {
    }

    public ArticleData(String id, String slug, String title, String description, String body, boolean favorited, int favoritesCount, Instant createdAt, Instant updatedAt, List<String> tagList, ProfileData profileData) {
        this.id = id;
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.body = body;
        this.favorited = favorited;
        this.favoritesCount = favoritesCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.tagList = tagList;
        this.profileData = profileData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public int getFavoritesCount() {
        return favoritesCount;
    }

    public void setFavoritesCount(int favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public ProfileData getProfileData() {
        return profileData;
    }

    public void setProfileData(ProfileData profileData) {
        this.profileData = profileData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleData that = (ArticleData) o;
        return favorited == that.favorited &&
                favoritesCount == that.favoritesCount &&
                Objects.equals(id, that.id) &&
                Objects.equals(slug, that.slug) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(body, that.body) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(tagList, that.tagList) &&
                Objects.equals(profileData, that.profileData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, slug, title, description, body, favorited, favoritesCount, createdAt, updatedAt, tagList, profileData);
    }

    @Override
    public String toString() {
        return "ArticleData{" +
                "id='" + id + '\'' +
                ", slug='" + slug + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", body='" + body + '\'' +
                ", favorited=" + favorited +
                ", favoritesCount=" + favoritesCount +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", tagList=" + tagList +
                ", profileData=" + profileData +
                '}';
    }
}

