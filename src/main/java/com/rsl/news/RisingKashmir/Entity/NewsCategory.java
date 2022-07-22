package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "NewsCategory")
public class NewsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer categoryID;
    @Column
     private String categoryType;

    public NewsCategory(Integer categoryID, String categoryType) {
        super();
        categoryID = categoryID;
        categoryType = categoryType;
    }
    public NewsCategory(){
        super();
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        categoryID = categoryID;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "News_Category{" +
                "CategoryID=" + categoryID +
                ", CategoryType='" + categoryType + '\'' +
                '}';
    }
}
