package Entity;

import javax.persistence.*;

@Entity(name = "Liked")
public class Liked {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Integer LikedId;
    @Column
    private Integer UserId;
    @Column
    private  Integer NewsId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NewsId")
    private News news;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserId")
    private User user;

    public Liked(Integer likedId, Integer userId, Integer newsId) {
        super();
        LikedId = likedId;
        UserId = userId;
        NewsId = newsId;
    }

    public Integer getLikedId() {
        return LikedId;
    }

    public void setLikedId(Integer likedId) {
        LikedId = likedId;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public Integer getNewsId() {
        return NewsId;
    }

    public void setNewsId(Integer newsId) {
        NewsId = newsId;
    }

    @Override
    public String toString() {
        return "Liked{" +
                "LikedId=" + LikedId +
                ", UserId=" + UserId +
                ", NewsId=" + NewsId +
                ", news=" + news +
                ", user=" + user +
                '}';
    }
}
