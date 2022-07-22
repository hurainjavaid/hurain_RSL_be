package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "NewsCategory")
public class NewsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer categoryId;
    @Column
     private String categoryType;

    public NewsCategory(Integer categoryId, String categoryType) {
        super();
        this.categoryId = categoryId;
        this.categoryType = categoryType;
    }
    public NewsCategory(){
        super();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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
                "categoryId=" + categoryId +
                ", categoryType='" + categoryType + '\'' +
                '}';
    }
}
