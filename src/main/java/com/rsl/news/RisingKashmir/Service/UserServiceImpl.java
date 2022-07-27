package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.User;
import com.rsl.news.RisingKashmir.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements  UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User saveUser) {
        return null;
    }
}
