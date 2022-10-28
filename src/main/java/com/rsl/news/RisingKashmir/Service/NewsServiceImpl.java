package com.rsl.news.RisingKashmir.Service;
import com.rsl.news.RisingKashmir.Entity.Location;
import com.rsl.news.RisingKashmir.Entity.News;
import com.rsl.news.RisingKashmir.Entity.NewsCategory;
import com.rsl.news.RisingKashmir.Repository.LocationRepository;
import com.rsl.news.RisingKashmir.Repository.NewsCategoryRepository;
import com.rsl.news.RisingKashmir.Repository.NewsRepository;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsRepository newsRepository;
    @Autowired
    LocationRepository locationRepository;

    @Autowired
    NewsCategoryRepository newsCategoryRepository;

    @Override
    public News saveNews(News saveNews) {

//        NewsCategory newsCategory= newsCategoryRepository.findById(saveNews.getCategoryId()).get();
//        saveNews.setCategoryId(saveNews.getCategoryId());


        Location location = locationRepository.findById(saveNews.getLocation().getId()).get();
        if (location != null) {
            saveNews.setLocation(location);
            News savenews1 = newsRepository.save(saveNews);
            return savenews1;
        }

        return null;
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
            if (updateNews.getNewsTitle() != null){
                news.setNewsTitle(updateNews.getNewsTitle());
            }
//            if(updateNews.getLocation() != null){
//                news.setLocation(updateNews.getLocation());
//            }
            return newsRepository.save(news);
        }
        return null;
    }

    @Override
    public Boolean deleteNews(Integer id) {
        Optional<News>news = newsRepository.findById(id);
        if(news.isPresent()){
            //TODO
            // get liked new by newsId
            // delete likedNews

            newsRepository.deleteById(id);
            return  true;
        }
        return false;
    }
}
