package Entity;

import javax.persistence.*;

@Entity(name = "NewsList")
public class NewsList {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Integer NewslistId;
   @Column
   private Integer CategoryID;
   @Column
   private Integer NewsId;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "CategoryId")
   private NewsCategory newscategory;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "NewsId")
   private News news;

   public NewsList(Integer newslistId, Integer categoryID, Integer newsId) {
      super();
      NewslistId = newslistId;
      CategoryID = categoryID;
      NewsId = newsId;
   }
   public NewsList(){
      super();
   }

   public Integer getNewslistId() {
      return NewslistId;
   }

   public void setNewslistId(Integer newslistId) {
      NewslistId = newslistId;
   }

   public Integer getCategoryID() {
      return CategoryID;
   }

   public void setCategoryID(Integer categoryID) {
      CategoryID = categoryID;
   }

   public Integer getNewsId() {
      return NewsId;
   }

   public void setNewsId(Integer newsId) {
      NewsId = newsId;
   }

   @Override
   public String toString() {
      return "News_List{" +
              "NewslistId=" + NewslistId +
              ", CategoryID=" + CategoryID +
              ", NewsId=" + NewsId +
              ", news_category=" + newscategory +
              ", news=" + news +
              '}';
   }
}
