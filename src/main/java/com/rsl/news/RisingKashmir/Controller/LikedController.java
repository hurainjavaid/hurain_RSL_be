package com.rsl.news.RisingKashmir.Controller;

import com.rsl.news.RisingKashmir.Entity.Liked;
import com.rsl.news.RisingKashmir.Entity.News;
import com.rsl.news.RisingKashmir.Service.LikedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/liked")
public class LikedController {
    @Autowired
    LikedService likedService;

    @PostMapping("/liked")
    public ResponseEntity save(@RequestBody Liked save){
        return ResponseEntity.status(HttpStatus.OK).body(likedService.saveLiked(save));
    }
    @GetMapping("/get-liked/{id}")
    public ResponseEntity getliked(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(likedService.getLikedById(id));
    }
    @GetMapping("/get-all-liked/{id}")
    public ResponseEntity getliked(){
        return ResponseEntity.status(HttpStatus.OK).body(likedService.getALLLiked());
    }
    @PutMapping("/update-liked/{id}")
    public ResponseEntity save(@RequestBody Liked updateLiked, @PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(likedService.updateLiked(id,updateLiked));
    }
    @DeleteMapping("/delete-liked/{id}")
    public ResponseEntity deleteNews(@PathVariable Integer id){
        return  ResponseEntity.status(HttpStatus.OK).body(likedService.deleteLiked(id));
    }
}
