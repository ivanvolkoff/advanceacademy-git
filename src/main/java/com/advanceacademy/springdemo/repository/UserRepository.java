package com.advanceacademy.springdemo.repository;

import com.advanceacademy.springdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public Set<User> findAllByFirstName(String firstName);
}
