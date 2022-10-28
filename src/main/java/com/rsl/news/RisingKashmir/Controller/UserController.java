package com.rsl.news.RisingKashmir.Controller;

import com.rsl.news.RisingKashmir.Entity.User;
import com.rsl.news.RisingKashmir.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/user")
    public ResponseEntity save(@RequestBody User save){
        return ResponseEntity.status(HttpStatus.OK).body(userService.saveUser(save));
    }
    @GetMapping("/get-user/{id}")
    public ResponseEntity getuser(@PathVariable Integer id){
        return  ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(id));
    }
    @GetMapping("/get-all-user/{id}")
    public ResponseEntity getuser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUser());
    }
    @PutMapping("/update-user/{id}")
    public ResponseEntity save(@RequestBody User updateUser , @PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(id, updateUser));
    }

    @DeleteMapping("/delete-user/{id}")
    public  ResponseEntity deleteUser(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.deleteUser(id));
    }
}
