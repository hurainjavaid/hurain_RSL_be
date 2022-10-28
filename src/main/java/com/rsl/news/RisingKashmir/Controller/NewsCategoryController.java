package com.rsl.news.RisingKashmir.Controller;


import com.rsl.news.RisingKashmir.Entity.NewsCategory;
import com.rsl.news.RisingKashmir.Entity.User;
import com.rsl.news.RisingKashmir.Repository.NewsCategoryRepository;
import com.rsl.news.RisingKashmir.Service.NewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/newscategory")
public class NewsCategoryController {
    @Autowired
    NewsCategoryService newsCategoryService;

    @PostMapping("/newscategory")
    public ResponseEntity save(@RequestBody NewsCategory save) {
        return ResponseEntity.status(HttpStatus.OK).body(newsCategoryService.saveNewsCategory(save));
    }
    @GetMapping("/get-newscategory/{id}")
    public ResponseEntity getnewscategory(@PathVariable Integer id){
        return  ResponseEntity.status(HttpStatus.OK).body(newsCategoryService.getNewsCategoryById(id));
    }
    @GetMapping("/get-all-newscategory/{id}")
    public ResponseEntity getnewscategory(){
        return ResponseEntity.status(HttpStatus.OK).body(newsCategoryService.getAllNewsCategory());
    }
    @PutMapping("/update-newscategory/{id}")
    public ResponseEntity save(@RequestBody NewsCategory updateNewsCategory , @PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(newsCategoryService.updateNewsCategory(id, updateNewsCategory));
    }
    @DeleteMapping("/delete-newscategory/{id}")
    public  ResponseEntity deleteNewsCategory(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(newsCategoryService.deleteNewsCategory(id));
    }
}
