package com.mogere.userservice.controller;


import com.mogere.userservice.entity.User;
import com.mogere.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String setMessage(){
        return "Welcome";
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User newUser){
        return userService.saveUser(newUser);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") Long userId){
        return userService.findUserById(userId);
    }
}
