package com.tweetero.tweeteroapi.models;

import com.tweetero.tweeteroapi.dto.TweetDTO;

public class Tweet extends User{
    private String text;

    public Tweet(TweetDTO tweet) {
        this.text = tweet.text();
        super.setUsername(tweet.username());
        super.setAvatar(tweet.avatar());
    }

    public String getText() {
        return text;
    }

}
