package io.spring.core.user;

import java.util.Objects;

public class FollowRelation {
    private String userId;
    private String targetId;

    public FollowRelation() {
    }

    public FollowRelation(String userId, String targetId) {
        this.userId = userId;
        this.targetId = targetId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FollowRelation that = (FollowRelation) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(targetId, that.targetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, targetId);
    }

    @Override
    public String toString() {
        return "FollowRelation{" +
                "userId='" + userId + '\'' +
                ", targetId='" + targetId + '\'' +
                '}';
    }
}
