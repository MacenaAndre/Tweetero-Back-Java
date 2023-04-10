package com.tweetero.tweeteroapi.models;

public class Tweet extends User{
    private String text;

    public Tweet(String username, String avatar, String text) {
        this.text = text;
        super.setUsername(username);
        super.setAvatar(avatar);
    }

    public String getText() {
        return text;
    }

}
