package com.example.news;

import com.example.news.Models.NewsHeadlines;

/* Interface pro metedu kliknutí na článek */
public interface SelectListener {
    void OnNewsClicked(NewsHeadlines headlines);
}
