package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.NewsCategory;

import java.util.List;
     public interface NewsCategoryService {
        NewsCategory saveNewsCategory(NewsCategory saveNewsCategory);
        NewsCategory getNewsCategoryById(Integer id);
        List< NewsCategory> getAllNewsCategory();

        NewsCategory updateNewsCategory(Integer id,  NewsCategory updateNewsCategory);

        Boolean deleteNewsCategory(Integer id);
    }

