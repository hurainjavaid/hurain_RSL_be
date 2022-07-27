package com.rsl.news.RisingKashmir.Repository;

import com.rsl.news.RisingKashmir.Entity.NewsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsCategoryRepository extends JpaRepository<NewsCategory,Integer> {
}
