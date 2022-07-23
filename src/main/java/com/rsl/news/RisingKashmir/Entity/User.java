package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer userId;
    @Column
    private  String UserName;
    @Column
    private String passwrd;
    @Column
    private  Integer locationId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "locationId")
    private Location location;

    public User(Integer userId, String userName, String passwrd, Integer locationId, Location location) {
        super();
        userId = userId;
        UserName = userName;
        this.passwrd = passwrd;
        this.locationId = locationId;
        this.location = location;
    }

    public User(){
        super();
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        userId = userId;
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
                "UserId=" + userId +
                ", UserName='" + UserName + '\'' +
                ", passwrd='" + passwrd + '\'' +
                ", locationId=" + locationId +
                ", location=" + location +
                '}';
    }
}
