package com.rsl.news.RisingKashmir.Service;

import com.rsl.news.RisingKashmir.Entity.User;
import com.rsl.news.RisingKashmir.Repository.LocationRepository;
import com.rsl.news.RisingKashmir.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    LocationRepository locationRepository;

    @Override
    public User saveUser(User saveUser) {
        User user = userRepository.save(saveUser);
        return user;
    }

    @Override
    public User getUserById(Integer id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Integer id, User updateUser) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            if (updateUser.getUserName() != null) {
                user.setUserName(updateUser.getUserName());
            }
            if (user != null) {
                user.setPasswrd(updateUser.getPasswrd());
            }
            return userRepository.save(user);
        }
        return null;
    }
    @Override
    public Boolean deleteUser(Integer id) {
        Optional<User> user= userRepository.findById(id);
        if (user.isPresent()){
            userRepository.deleteById(id);
            return  true;
        }
        return false;
    }
}

