package com.rsl.news.RisingKashmir.Service;
import com.rsl.news.RisingKashmir.Entity.News;
import com.rsl.news.RisingKashmir.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService{
    @Autowired
    NewsRepository newsRepository;

    @Override
    public News saveNews(News saveNews) {
        News news = newsRepository.save(saveNews);
        return news;
    }
}
