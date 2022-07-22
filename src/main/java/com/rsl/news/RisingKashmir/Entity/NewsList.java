package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "NewsList")
public class NewsList {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Integer newslistId;
   @Column
   private Integer categoryID;
   @Column
   private Integer newsId;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "categoryId")
   private NewsCategory newscategory;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "newsId")
   private News news;

   public NewsList(Integer newslistId, Integer categoryID, Integer newsId) {
      super();
      newslistId = newslistId;
      categoryID = categoryID;
      newsId = newsId;
   }
   public NewsList(){
      super();
   }

   public Integer getNewslistId() {
      return newslistId;
   }

   public void setNewslistId(Integer newslistId) {
      this.newslistId = newslistId;
   }

   public Integer getCategoryID() {
      return categoryID;
   }

   public void setCategoryID(Integer categoryID) {
      this.categoryID = categoryID;
   }

   public Integer getNewsId() {
      return newsId;
   }

   public void setNewsId(Integer newsId) {
      this.newsId = newsId;
   }

   public NewsCategory getNewscategory() {
      return newscategory;
   }

   public void setNewscategory(NewsCategory newscategory) {
      this.newscategory = newscategory;
   }

   public News getNews() {
      return news;
   }

   public void setNews(News news) {
      this.news = news;
   }

   @Override
   public String toString() {
      return "NewsList{" +
              "newslistId=" + newslistId +
              ", categoryID=" + categoryID +
              ", newsId=" + newsId +
              ", newscategory=" + newscategory +
              ", news=" + news +
              '}';
   }
}

