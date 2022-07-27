package com.rsl.news.RisingKashmir.Controller;

import com.rsl.news.RisingKashmir.Entity.Liked;
import com.rsl.news.RisingKashmir.Service.LikedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/liked")
public class LikedController {
    @Autowired
    LikedService likedService;

    @PostMapping("/liked")
    public ResponseEntity save(@RequestBody Liked save){
        return ResponseEntity.status(HttpStatus.OK).body(likedService.saveLiked(save));
    }
}
