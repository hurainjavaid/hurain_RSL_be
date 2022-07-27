package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.Liked;


import java.util.List;

public interface LikedService {
    Liked saveLiked(Liked saveLiked);
    Liked getLikedById(Integer id);
    List<Liked> getALLLiked();
    Liked updateLiked(Integer id,Liked updateLiked);

    Boolean deleteLiked(Integer id);
}
