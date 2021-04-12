package com.mogere.userservice.service;


import com.mogere.userservice.entity.User;
import com.mogere.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User newUser) {

        return userRepository.save(newUser);
    }

    public User findUserById(Long userId) {
        return userRepository.findUserById(userId);
    }
}
