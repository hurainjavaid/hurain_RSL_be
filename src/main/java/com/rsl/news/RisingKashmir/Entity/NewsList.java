package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "NewsList")
public class NewsList {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Integer newslistId;
   @Column
   private Integer categoryId;
   @Column
   private Integer newsId;

//   @OneToOne(cascade = CascadeType.ALL)
//   @JoinColumn(name = "categoryId")
//   private NewsCategory newscategory;
//
//   @OneToOne(cascade = CascadeType.ALL)
//   @JoinColumn(name = "newsId")
//   private News news;


   public NewsList(Integer newslistId, Integer categoryId, Integer newsId) {
      super();
      this.newslistId = newslistId;
      this.categoryId = categoryId;
      this.newsId = newsId;
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

   public Integer getCategoryId() {
      return categoryId;
   }

   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   public Integer getNewsId() {
      return newsId;
   }

   public void setNewsId(Integer newsId) {
      this.newsId = newsId;
   }

   @Override
   public String toString() {
      return "NewsList{" +
              "newslistId=" + newslistId +
              ", categoryId=" + categoryId +
              ", newsId=" + newsId +
              '}';
   }
}


