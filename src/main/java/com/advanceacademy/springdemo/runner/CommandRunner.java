package com.advanceacademy.springdemo.runner;

import com.advanceacademy.springdemo.entity.User;
import com.advanceacademy.springdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.net.Socket;
import java.util.Set;

@Component
public class CommandRunner implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = User.builder()
                .firstName("Ivan")
                .lastName("Nikolov")
                .age(24)
                .build();

        User user2 = User.builder()
                .firstName("Ivan")
                .lastName("Nikolov")
                .age(24)
                .build();

        User user3 = User.builder()
                .firstName("Kalin")
                .lastName("Nikov")
                .age(42)
                .build();

        User savedUser = userRepository.save(user1);
        System.out.println(savedUser.toString());

        Set<User> users = userRepository.findAllByFirstName("Ivan");
        users.forEach(System.out::println);
    }
}
