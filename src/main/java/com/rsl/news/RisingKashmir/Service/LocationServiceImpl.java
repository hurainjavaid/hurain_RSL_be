package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.Location;
import com.rsl.news.RisingKashmir.Entity.User;
import com.rsl.news.RisingKashmir.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LocationServiceImpl implements LocationService{
    @Autowired
    LocationRepository locationRepository;

    @Override
    public Location saveLocation(Location saveLocation) {
        Location  location = locationRepository.save(saveLocation );
        return location;
    }

    @Override
    public Location getLocationById(Integer id) {
        Location location = locationRepository.findById(id).get();
        return location;
    }

    @Override
    public List<Location> getAllLocation() {
        return locationRepository.findAll();
    }

    @Override
    public Location updateLocation(Integer id, Location updateLocation) {
        Location location = locationRepository.findById(id).orElse(null);
        if (location != null) {
            if (updateLocation.getLocationName() != null) {
                location.setLocationName(updateLocation.getLocationName());
            }
            return locationRepository.save(location);
        }
        return null;
    }

    @Override
    public Boolean deleteLocation(Integer id) {
        Optional<Location> location= locationRepository.findById(id);
        if (location.isPresent()) {
            locationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
