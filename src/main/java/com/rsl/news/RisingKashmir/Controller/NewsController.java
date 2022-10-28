package com.rsl.news.RisingKashmir.Controller;
import com.rsl.news.RisingKashmir.Entity.News;
import com.rsl.news.RisingKashmir.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    NewsService newsService;
    @PostMapping("/news")
    public ResponseEntity save(@RequestBody News save){
        return  ResponseEntity.status(HttpStatus.OK).body(newsService.saveNews(save));
    }

    @GetMapping("/get-news/{id}")
        public ResponseEntity getnews(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(newsService.getNewsById(id));
    }
  @GetMapping("/get-all-news/{id}")
  public ResponseEntity getnews(){
        return ResponseEntity.status(HttpStatus.OK).body(newsService.getAllNews());
  }

    @PutMapping("/update-news/{id}")
    public ResponseEntity save(@RequestBody News updateNews, @PathVariable Integer id){
       return ResponseEntity.status(HttpStatus.OK).body(newsService.updateNews(id,updateNews));
    }

    @DeleteMapping("/delete-news/{id}")
    public ResponseEntity deleteNews(@PathVariable Integer id){
        return  ResponseEntity.status(HttpStatus.OK).body(newsService.deleteNews(id));
    }



}
