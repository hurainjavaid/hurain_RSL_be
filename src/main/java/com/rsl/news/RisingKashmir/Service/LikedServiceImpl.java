package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.Liked;
import com.rsl.news.RisingKashmir.Entity.News;
import com.rsl.news.RisingKashmir.Repository.LikedRepository;
import com.rsl.news.RisingKashmir.Repository.NewsRepository;
import com.rsl.news.RisingKashmir.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikedServiceImpl implements LikedService{
    @Autowired
    NewsRepository newsRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    LikedRepository likedRepository;
    @Override
    public Liked saveLiked(Liked saveLiked) {
        News news=newsRepository.findById(saveLiked.getNews().getId()).get();
        if (news != null){
            saveLiked.setNews(news);
            Liked saveliked = likedRepository.save(saveLiked);
            return saveLiked;
        }
        return null;
    }

    @Override
    public Liked getLikedById(Integer id) {
        Liked liked=likedRepository.findById(id).get();
        return liked;
    }

    @Override
    public List<Liked> getALLLiked() {
        return likedRepository.findAll();
    }

    @Override
    public Liked updateLiked(Integer id, Liked updateLiked) {
        Liked liked= likedRepository.findById(id).orElse(null);
        if (liked != null){
            if (updateLiked.getUserId() != null){
                liked.setUserId(updateLiked.getUserId());
            }
            if (updateLiked.getNews() != null){
                liked.setNews(updateLiked.getNews());
            }
            return likedRepository.save(liked);
        }
        return null;
    }

    @Override
    public Boolean deleteLiked(Integer id) {
        Optional<Liked> liked = likedRepository.findById(id);
        if (liked.isPresent()){
            likedRepository.deleteById(id);
            return  true;
        }
        return false;
    }
}
