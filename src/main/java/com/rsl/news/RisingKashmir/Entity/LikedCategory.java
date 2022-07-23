package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "LikedCategory")
public class LikedCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
//    @Column
//    private  Integer userId;
    @Column
    private Integer categoryId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "categoryId")
//    private NewsCategory news_category;

    public LikedCategory(Integer id, Integer userId, Integer categoryId, User user, NewsCategory news_category) {
        super();
        this.id = id;

        this.categoryId = categoryId;
        this.user = user;

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





    @Override
    public String toString() {
        return "LikedCategory{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", user=" + user +
                '}';
    }
}
