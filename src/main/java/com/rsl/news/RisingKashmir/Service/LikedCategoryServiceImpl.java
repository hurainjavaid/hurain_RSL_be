package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.LikedCategory;
import com.rsl.news.RisingKashmir.Entity.News;
import com.rsl.news.RisingKashmir.Entity.NewsCategory;
import com.rsl.news.RisingKashmir.Entity.User;
import com.rsl.news.RisingKashmir.Repository.LikedCategoryRepository;
import com.rsl.news.RisingKashmir.Repository.NewsCategoryRepository;
import com.rsl.news.RisingKashmir.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikedCategoryServiceImpl implements LikedCategoryService {
    @Autowired
    LikedCategoryRepository likedCategoryRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    NewsCategoryRepository newsCategoryRepository;

    @Override
    public LikedCategory saveLikedCategory(LikedCategory saveLikedCategory) {
//        NewsCategory newsCategory=newsCategoryRepository.findById(saveLikedCategory.getCategoryId()).get();
        User user=userRepository.findById(saveLikedCategory.getUser().getId()).get();
        if (user != null){
            saveLikedCategory.setUser(user);
            LikedCategory savelikedcategory = likedCategoryRepository.save(saveLikedCategory);
            return  saveLikedCategory;
        }

        return null;
    }

    @Override
    public LikedCategory getLikedCategoryById(Integer id) {
       LikedCategory likedCategory=likedCategoryRepository.findById(id).get();
       return likedCategory;
    }

    @Override
    public List<LikedCategory> getALLLikedCategory() {
        return likedCategoryRepository.findAll();
    }

    @Override
    public LikedCategory updateLikedCategory(Integer id, LikedCategory updateLikedCategory) {
        LikedCategory likedCategory= likedCategoryRepository.findById(id).orElse(null);
        if (likedCategory != null){
            if (updateLikedCategory.getCategoryId() != null){
                likedCategory.setCategoryId(updateLikedCategory.getCategoryId());
            }
            if (updateLikedCategory.getUser() != null){
                likedCategory.setUser(updateLikedCategory.getUser());
           }
        }
        return null;
    }

    @Override
    public Boolean deleteLikedCategory(Integer id) {
        Optional<LikedCategory>likedCategory= likedCategoryRepository.findById(id);
        if (likedCategory.isPresent()){
            likedCategoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
