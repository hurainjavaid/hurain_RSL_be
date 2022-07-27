package com.rsl.news.RisingKashmir.Repository;

import com.rsl.news.RisingKashmir.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
