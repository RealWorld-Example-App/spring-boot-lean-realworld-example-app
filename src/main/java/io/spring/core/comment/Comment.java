package io.spring.core.comment;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class Comment {
    private String id;
    private String body;
    private String userId;
    private String articleId;
    private Instant createdAt;

    public Comment() {
    }

    public Comment(String body, String userId, String articleId) {
        this.id = UUID.randomUUID().toString();
        this.body = body;
        this.userId = userId;
        this.articleId = articleId;
        this.createdAt = Instant.now();
    }

    public String getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getUserId() {
        return userId;
    }

    public String getArticleId() {
        return articleId;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(id, comment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", body='" + body + '\'' +
                ", userId='" + userId + '\'' +
                ", articleId='" + articleId + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
