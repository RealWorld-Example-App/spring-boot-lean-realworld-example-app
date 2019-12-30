package io.spring.application.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ArticleDataList {
    @JsonProperty("articles")
    private final List<ArticleData> articleDatas;
    @JsonProperty("articlesCount")
    private final int count;

    public ArticleDataList(List<ArticleData> articleDatas, int count) {

        this.articleDatas = articleDatas;
        this.count = count;
    }

    public List<ArticleData> getArticleDatas() {
        return articleDatas;
    }

    public int getCount() {
        return count;
    }
}
