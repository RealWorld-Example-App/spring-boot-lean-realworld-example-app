package io.spring.core.article;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Article {
    private String userId;
    private String id;
    private String slug;
    private String title;
    private String description;
    private String body;
    private List<Tag> tags;
    private Instant createdAt;
    private Instant updatedAt;

    public Article() {
    }

    public Article(String title, String description, String body, String[] tagList, String userId) {
        this(title, description, body, tagList, userId, Instant.now());
    }

    public Article(String title, String description, String body, String[] tagList, String userId, Instant createdAt) {
        this.id = UUID.randomUUID().toString();
        this.slug = toSlug(title);
        this.title = title;
        this.description = description;
        this.body = body;
        this.tags = Arrays.stream(tagList).collect(toSet()).stream().map(Tag::new).collect(toList());
        this.userId = userId;
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
    }

    public void update(String title, String description, String body) {
        if (!"".equals(title)) {
            this.title = title;
            this.slug = toSlug(title);
        }
        if (!"".equals(description)) {
            this.description = description;
        }
        if (!"".equals(body)) {
            this.body = body;
        }
        this.updatedAt = Instant.now();
    }

    private String toSlug(String title) {
        return title.toLowerCase().replaceAll("[\\&|[\\uFE30-\\uFFA0]|\\’|\\”|\\s\\?\\,\\.]+", "-");
    }

    public String getUserId() {
        return userId;
    }

    public String getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBody() {
        return body;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(id, article.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
