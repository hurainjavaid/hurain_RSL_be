package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "NewsCategory")
public class NewsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
     private String categoryType;

    public NewsCategory(Integer id, String categoryType) {
        super();
        this.id = id;
        this.categoryType = categoryType;
    }
    public NewsCategory(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "NewsCategory{" +
                "id=" + id +
                ", categoryType='" + categoryType + '\'' +
                '}';
    }
}
