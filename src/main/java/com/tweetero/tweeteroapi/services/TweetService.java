package com.tweetero.tweeteroapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.tweeteroapi.TweeteroapiApplication;
import com.tweetero.tweeteroapi.dto.TweetDTO;
import com.tweetero.tweeteroapi.models.Tweet;
import com.tweetero.tweeteroapi.models.User;

@Service
public class TweetService {

    @Autowired
    private UserService userService;

    public void postTweet(TweetDTO tweet) {
        User user = userService.getUser(tweet.username());

        TweeteroapiApplication.tweetRpostitory.createTweet(new Tweet(tweet.username(), user.getAvatar(), tweet.text()));
    }

    public List<Tweet> listAllUserTweets(String username) {
        return TweeteroapiApplication.tweetRpostitory.findAllTweetsByUsername(username);
    }

    public List<Tweet> listTweetsByPage(int page) {
        return TweeteroapiApplication.tweetRpostitory.findTweetsByPage(page);
    }
}
