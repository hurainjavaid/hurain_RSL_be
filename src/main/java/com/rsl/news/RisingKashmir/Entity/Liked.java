package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "Liked")
public class Liked {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
//    @Column
//    private Integer UserId;
//    @Column
//    private Integer NewsId;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "NewsId")
    private News news;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "UserId")
    private User user;

    public Liked(Integer id, Integer userId, Integer newsId, News news, User user) {
        super();
        this.id = id;
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
                ", news=" + news +
                ", user=" + user +
                '}';
    }
}
