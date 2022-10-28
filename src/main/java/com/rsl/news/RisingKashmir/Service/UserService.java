package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User saveUser);
    User getUserById(Integer id);
    List<User> getAllUser();

    User updateUser(Integer id, User updateUser);

    Boolean deleteUser(Integer id);

}
