package com.rsl.news.RisingKashmir.Controller;

import com.rsl.news.RisingKashmir.Entity.LikedCategory;
import com.rsl.news.RisingKashmir.Service.LikedCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/likedcategory")
public class LikedCategoryController {
    @Autowired
    LikedCategoryService likedCategoryService;

    @PostMapping("/likedcategory")
    public ResponseEntity save(@RequestBody LikedCategory save){
        return ResponseEntity.status(HttpStatus.OK).body(likedCategoryService.saveLikedCategory(save));
    }

    @GetMapping("/get-likedcategory/{id}")
    public  ResponseEntity getlikedcategory(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(likedCategoryService.getLikedCategoryById(id));
    }

    @PutMapping("/update-likedcategory/{id}")
    public ResponseEntity save(@RequestBody LikedCategory updatelikedcategory,@PathVariable Integer id){
        return  ResponseEntity.status(HttpStatus.OK).body(likedCategoryService.updateLikedCategory(id,updatelikedcategory));
    }

    @DeleteMapping("/delete-likedcategory")
    public ResponseEntity deleteLikedCategory(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(likedCategoryService.deleteLikedCategory(id));
    }
}
