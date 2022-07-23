package com.rsl.news.RisingKashmir.Service;
import com.rsl.news.RisingKashmir.Entity.News;
import com.rsl.news.RisingKashmir.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsRepository newsRepository;

    @Override
    public News saveNews(News saveNews) {
        News news = newsRepository.save(saveNews);
        return news;
    }

    @Override
    public News getNewsById(Integer id) {
        News news = newsRepository.findById(id).get();
        return news;
    }

    @Override
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public News updateNews(Integer id, News updateNews) {
        News news = newsRepository.findById(id).orElse(null);
        if (news != null) {
            if (updateNews.getNewsDescription() != null) {
                news.setNewsDescription(updateNews.getNewsDescription());
            }
            if (updateNews.getNewsDetails() != null) {
                news.setNewsDetails(updateNews.getNewsDetails());
            }
            if(updateNews.getCategoryId()!=null) {
                news.setCategoryId(updateNews.getCategoryId());
            }
            return newsRepository.save(news);
        }
        return null;
    }

    @Override
    public Boolean deleteNews(Integer id) {
        Optional<News>news = newsRepository.findById(id);
        if(news.isPresent()){
            newsRepository.deleteById(id);
            return  true;
        }
        return false;
    }
}
