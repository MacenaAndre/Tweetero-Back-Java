package com.tweetero.tweeteroapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.tweeteroapi.dto.UserDTO;
import com.tweetero.tweeteroapi.services.UserService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/sign-up")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public String signUp(@RequestBody @Valid UserDTO user) {
        service.postUser(user);
        return "OK";
    }
    
}
