package com.example.news;

import com.example.news.Models.NewsHeadlines;

import com.example.news.Models.NewsApiResponse;
import java.util.List;

/*Inrterface pro metody volání REST API*/
public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
