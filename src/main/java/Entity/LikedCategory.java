package Entity;

import javax.persistence.*;

@Entity(name = "LikedCategory")
public class LikedCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer LikedCategoryId;
    @Column
    private  Integer UserId;
    @Column
    private Integer CategoryId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserId")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CategoryId")
    private NewsCategory news_category;

    public LikedCategory(Integer likedCategoryId, Integer userId, Integer categoryId) {
        super();
        LikedCategoryId = likedCategoryId;
        UserId = userId;
        CategoryId = categoryId;
    }
    public LikedCategory(){
        super();
    }

    public Integer getLikedCategoryId() {
        return LikedCategoryId;
    }

    public void setLikedCategoryId(Integer likedCategoryId) {
        LikedCategoryId = likedCategoryId;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer categoryId) {
        CategoryId = categoryId;
    }

    @Override
    public String toString() {
        return "LikedCategory{" +
                "LikedCategoryId=" + LikedCategoryId +
                ", UserId=" + UserId +
                ", CategoryId=" + CategoryId +
                ", user=" + user +
                ", news_category=" + news_category +
                '}';
    }
}
