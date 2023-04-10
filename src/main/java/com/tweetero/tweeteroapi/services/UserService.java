package com.tweetero.tweeteroapi.services;

import org.springframework.stereotype.Service;

import com.tweetero.tweeteroapi.TweeteroapiApplication;
import com.tweetero.tweeteroapi.dto.UserDTO;
import com.tweetero.tweeteroapi.models.User;

@Service
public class UserService {
    
    public void postUser(UserDTO user) {

        TweeteroapiApplication.userRepository.createUser(user);

    }

    public User getUser(String username) {

        return TweeteroapiApplication.userRepository.findUserByUsername(username);

    }
}
