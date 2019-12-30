package io.spring.application.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.Objects;

public class CommentData {
    private String id;
    private String body;
    @JsonIgnore
    private String articleId;
    private Instant createdAt;
    private Instant updatedAt;
    @JsonProperty("author")
    private ProfileData profileData;

    public CommentData() {
    }

    public CommentData(String id, String body, String articleId, Instant createdAt, Instant updatedAt, ProfileData profileData) {
        this.id = id;
        this.body = body;
        this.articleId = articleId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.profileData = profileData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
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
        CommentData that = (CommentData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(body, that.body) &&
                Objects.equals(articleId, that.articleId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(profileData, that.profileData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body, articleId, createdAt, updatedAt, profileData);
    }

    @Override
    public String toString() {
        return "CommentData{" +
                "id='" + id + '\'' +
                ", body='" + body + '\'' +
                ", articleId='" + articleId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", profileData=" + profileData +
                '}';
    }
}
