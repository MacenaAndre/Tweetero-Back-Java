package com.tweetero.tweeteroapi.models;

import com.tweetero.tweeteroapi.dto.UserDTO;

public class User {
    private String username;
    private String avatar;

    public User(UserDTO user) {
        this.username = user.username();
        this.avatar = user.avatar();
    }

    public String getUsername() {
        return username;
    }

    public String getAvatar() {
        return avatar;
    }

}
