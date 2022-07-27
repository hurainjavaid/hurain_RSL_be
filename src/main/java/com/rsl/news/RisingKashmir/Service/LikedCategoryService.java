package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.LikedCategory;
import java.util.List;

public interface LikedCategoryService {
    LikedCategory saveLikedCategory(LikedCategory saveLikedCategory);

    LikedCategory getLikedCategoryById(Integer id);
    List<LikedCategory> getALLLikedCategory();

    LikedCategory updateLikedCategory(Integer id, LikedCategory updateLikedCategory);

    Boolean deleteLikedCategory(Integer id);
}
