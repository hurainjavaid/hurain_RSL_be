package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.Location;

import java.util.List;

public interface LocationService {
    Location saveLocation(Location saveLocation);
    Location getLocationById(Integer id);
    List<Location> getAllLocation();

    Location updateLocation(Integer id, Location updateLocation);

    Boolean deleteLocation(Integer id);
}
