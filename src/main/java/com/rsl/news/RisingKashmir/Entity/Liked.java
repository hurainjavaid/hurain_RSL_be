package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "Liked")
public class Liked {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private Integer UserId;
    @Column
    private Integer NewsId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NewsId")
    private News news;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserId")
    private User user;

    public Liked(Integer id, Integer userId, Integer newsId, News news, User user) {
        super();
        this.id = id;
        UserId = userId;
        NewsId = newsId;
        this.news = news;
        this.user = user;
    }
    public  Liked(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public Integer getNewsId() {
        return NewsId;
    }

    public void setNewsId(Integer newsId) {
        NewsId = newsId;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Liked{" +
                "id=" + id +
                ", UserId=" + UserId +
                ", NewsId=" + NewsId +
                ", news=" + news +
                ", user=" + user +
                '}';
    }
}
