package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer newsId;
    @Column
    private String newsDescription; // use camel case
    @Column
    private String newsDetails;
    @Column
    private Integer categoryId;
    @Column
    private Integer locationId;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsDescription() {
        return newsDescription;
    }

    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
    }

    public String getNewsDetails() {
        return newsDetails;
    }

    public void setNewsDetails(String newsDetails) {
        this.newsDetails = newsDetails;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }
}

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "categoryId")
//    private NewsCategory newsCategory;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "locationId")
//    private Location location;


