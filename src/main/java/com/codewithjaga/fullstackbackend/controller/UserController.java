package com.codewithjaga.fullstackbackend.controller;

import com.codewithjaga.fullstackbackend.model.User;
import com.codewithjaga.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return repo.save(newUser);
    }

    @GetMapping("/users")
    List<User>getAllUsers(){
        return repo.findAll();
    }

}
