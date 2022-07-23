package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "LikedCategory")
public class LikedCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private  Integer userId;
    @Column
    private Integer categoryId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId")
    private NewsCategory news_category;

    public LikedCategory(Integer id, Integer userId, Integer categoryId, User user, NewsCategory news_category) {
        super();
        this.id = id;
        this.userId = userId;
        this.categoryId = categoryId;
        this.user = user;
        this.news_category = news_category;
    }
    public LikedCategory(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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

    @Override
    public String toString() {
        return "LikedCategory{" +
                "id=" + id +
                ", userId=" + userId +
                ", categoryId=" + categoryId +
                ", user=" + user +
                ", news_category=" + news_category +
                '}';
    }
}
