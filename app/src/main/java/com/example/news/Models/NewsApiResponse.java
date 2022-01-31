package com.example.news.Models;

import java.io.Serializable;
import java.util.List;

/* Třída reprezentující odpověď z API */
public class NewsApiResponse implements Serializable {
    String status;
    Integer totalResults;
    List<NewsHeadlines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsHeadlines> articles) {
        this.articles = articles;
    }
}
