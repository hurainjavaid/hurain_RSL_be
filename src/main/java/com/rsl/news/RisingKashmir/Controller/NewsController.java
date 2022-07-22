package com.rsl.news.RisingKashmir.Controller;
import com.rsl.news.RisingKashmir.Entity.News;
import com.rsl.news.RisingKashmir.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    NewsService newsService;
    @PostMapping("/news")
    public ResponseEntity save(@RequestBody News save){
        return  ResponseEntity.status(HttpStatus.OK).body(newsService.saveNews(save));
    }



}
