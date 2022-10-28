package com.rsl.news.RisingKashmir.Controller;


import com.rsl.news.RisingKashmir.Entity.Location;
import com.rsl.news.RisingKashmir.Entity.User;
import com.rsl.news.RisingKashmir.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    LocationService locationService;
    @PostMapping("/location")
    public ResponseEntity save(@RequestBody Location save){
        return ResponseEntity.status(HttpStatus.OK).body(locationService.saveLocation(save));
    }

    @GetMapping("/get-location/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity getlocation(@PathVariable Integer id){
        return  ResponseEntity.status(HttpStatus.OK).body(locationService.getLocationById(id));
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/get-all-location")
    public ResponseEntity getlocation(){
        return ResponseEntity.status(HttpStatus.OK).body(locationService.getAllLocation());
    }
    @PutMapping("/update-location/{id}")
    public ResponseEntity save(@RequestBody Location updateLocation, @PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(locationService.updateLocation(id, updateLocation));
    }
    @DeleteMapping("/delete-location/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public  ResponseEntity deleteLocation(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(locationService.deleteLocation(id));
    }
}
