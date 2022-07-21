package Entity;

import javax.persistence.*;

@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer UserId;
    @Column
    private  String UserName;
    @Column
    private String passwrd;
    @Column
    private  Integer LocationId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LocationId")
    private Location location;

    public User(Integer userId, String userName, String passwrd) {
        super();
        UserId = userId;
        UserName = userName;
        this.passwrd = passwrd;
    }
    public User(){
        super();
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", passwrd='" + passwrd + '\'' +
                ", LocationId=" + LocationId +
                ", location=" + location +
                '}';
    }
}
