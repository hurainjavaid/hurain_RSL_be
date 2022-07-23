package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "LikedCategory")
public class LikedCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer LikedCategoryId;
    @Column
    private  Integer userId;
    @Column
    private Integer CategoryId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId")
    private NewsCategory news_category;

    public LikedCategory(Integer likedCategoryId, Integer userId, Integer categoryId, User user, NewsCategory news_category) {
        super();
        LikedCategoryId = likedCategoryId;
        this.userId = userId;
        CategoryId = categoryId;
        this.user = user;
        this.news_category = news_category;
    }

    public LikedCategory(){
        super();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public NewsCategory getNews_category() {
        return news_category;
    }

    public void setNews_category(NewsCategory news_category) {
        this.news_category = news_category;
    }

    public Integer getLikedCategoryId() {
        return LikedCategoryId;
    }

    public void setLikedCategoryId(Integer likedCategoryId) {
        LikedCategoryId = likedCategoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        userId = userId;
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer categoryId) {
        CategoryId = categoryId;
    }

    @Override
    public String toString() {
        return "LikedCategory{" +
                "LikedCategoryId=" + LikedCategoryId +
                ", userId=" + userId +
                ", CategoryId=" + CategoryId +
                ", user=" + user +
                ", news_category=" + news_category +
                '}';
    }
}
