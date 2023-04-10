package com.tweetero.tweeteroapi.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tweetero.tweeteroapi.dto.UserDTO;
import com.tweetero.tweeteroapi.models.User;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void createUser(UserDTO user) {
        users.add(new User(user));
    }

    public Optional<User> findUserByUsername(String username) {

        User user = new User();

        for(int i = 0; i < users.size(); i++) {

            if(users.get(i).getUsername().equals(username)) {

                user = users.get(i);
            }
        }

        return Optional.ofNullable(user);
        
    }
}
