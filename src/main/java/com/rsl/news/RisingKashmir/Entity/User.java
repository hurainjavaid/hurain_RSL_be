package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private  String UserName;
    @Column
    private String passwrd;
    @Column
    private  Integer locationId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "locationId")
    private Location location;

    public User(Integer id, String userName, String passwrd, Integer locationId, Location location) {
        super();
        this.id = id;
        UserName = userName;
        this.passwrd = passwrd;
        this.locationId = locationId;
        this.location = location;
    }
    public User(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", UserName='" + UserName + '\'' +
                ", passwrd='" + passwrd + '\'' +
                ", locationId=" + locationId +
                ", location=" + location +
                '}';
    }
}
