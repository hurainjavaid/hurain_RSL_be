package com.rsl.news.RisingKashmir.Repository;

import Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface NewsRepository {
    @Repository
    public interface NewsRepository extends JpaRepository<News,Integer> {
    }
}
