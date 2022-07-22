package com.rsl.news.RisingKashmir.Entity;

import javax.persistence.*;

@Entity(name = "Location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer locationId;
    @Column
    private  String locationName;

    public Location(Integer locationId, String locationName) {
        super();
        locationId = locationId;
        locationName = locationName;
    }
    public Location(){
        super();
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        locationName = locationName;
    }
    

    @Override
    public String toString() {
        return "Location{" +
                "LocationId=" + locationId +
                ", LocationName='" + locationName + '\'' +
                '}';



    }
}
