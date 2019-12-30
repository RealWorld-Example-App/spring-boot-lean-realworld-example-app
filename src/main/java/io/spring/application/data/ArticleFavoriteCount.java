package io.spring.application.data;

import java.util.Objects;

public class ArticleFavoriteCount {
    private final String id;
    private final Integer count;

    public ArticleFavoriteCount(String id, Integer count) {
        this.id = id;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleFavoriteCount that = (ArticleFavoriteCount) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, count);
    }

    @Override
    public String toString() {
        return "ArticleFavoriteCount{" +
                "id='" + id + '\'' +
                ", count=" + count +
                '}';
    }
}
