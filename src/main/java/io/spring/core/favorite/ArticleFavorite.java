package io.spring.core.favorite;

import java.util.Objects;

public class ArticleFavorite {
    private String articleId;
    private String userId;

    public ArticleFavorite() {
    }

    public ArticleFavorite(String articleId, String userId) {
        this.articleId = articleId;
        this.userId = userId;
    }

    public String getArticleId() {
        return articleId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleFavorite that = (ArticleFavorite) o;
        return Objects.equals(articleId, that.articleId) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, userId);
    }
}
