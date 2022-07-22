package com.rsl.news.RisingKashmir.Repository;

import com.rsl.news.RisingKashmir.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface NewsRepository extends JpaRepository<News,Integer> {
    }

