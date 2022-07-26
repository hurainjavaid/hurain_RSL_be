package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private String newsDescription;
    @Column
    private String newsDetails;
    @Column
    private String newsTitle;
    @Column
    private Integer categoryId;
//    @Column
//    private Integer locationId;

    //    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "categoryId")
//    private NewsCategory newsCategory;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "locationId")
    private Location location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}





