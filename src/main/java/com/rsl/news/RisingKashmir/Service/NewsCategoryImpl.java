package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.LikedCategory;
import com.rsl.news.RisingKashmir.Entity.News;
import com.rsl.news.RisingKashmir.Entity.NewsCategory;
import com.rsl.news.RisingKashmir.Entity.User;
import com.rsl.news.RisingKashmir.Repository.NewsCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsCategoryImpl implements  NewsCategoryService{
    @Autowired
    NewsCategoryRepository newsCategoryRepository;

    @Override
    public NewsCategory saveNewsCategory(NewsCategory saveNewsCategory) {
        NewsCategory newsCategory   = newsCategoryRepository.save(saveNewsCategory);
        return newsCategory;
    }

    @Override
    public NewsCategory getNewsCategoryById(Integer id) {
        NewsCategory  newsCategory = newsCategoryRepository.findById(id).get();
        return newsCategory;
    }

    @Override
    public List<NewsCategory> getAllNewsCategory() {
         return newsCategoryRepository.findAll();
    }

    @Override
    public NewsCategory updateNewsCategory(Integer id, NewsCategory updateNewsCategory) {
        NewsCategory newsCategory = newsCategoryRepository.findById(id).orElse(null);
        if (newsCategory != null) {
            if (updateNewsCategory.getCategoryType() != null) {
                newsCategory.setCategoryType(updateNewsCategory.getCategoryType());
            }
            if (newsCategory!= null) {
                newsCategory.setCategoryType(updateNewsCategory.getCategoryType());
            }
            return newsCategoryRepository.save(newsCategory);
        }
        return null;
    }

    @Override
    public Boolean deleteNewsCategory(Integer id) {
        Optional<NewsCategory> newsCategory= newsCategoryRepository.findById(id);
        if (newsCategory.isPresent()){
            newsCategoryRepository.deleteById(id);
            return  true;
        }
        return false;
    }
}
