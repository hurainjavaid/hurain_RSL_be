package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.News;

import java.util.List;

public interface NewsService{
   News saveNews(News saveNews);
   News getNewsById(Integer id);
   List<News> getAllNews();

   News updateNews(Integer id, News updateNews);

   Boolean deleteNews(Integer id);
}

