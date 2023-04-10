package com.tweetero.tweeteroapi.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tweetero.tweeteroapi.models.Tweet;

public class TweetRepository {
    private List<Tweet> tweets = new ArrayList<>();

    public void createTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public List<Tweet> findAllTweetsByUsername(String username) {
        List<Tweet> userTweets = new ArrayList<>();

        for(int i = 0; i < tweets.size(); i++) {

            if(tweets.get(i).getUsername().equals(username)) {

                userTweets.add(tweets.get(i));
            }
        }

        return userTweets;
    }

    public List<Tweet> findTweetsByPage(int page) {
        int first = tweets.size() - (page * 5);
        int last = first - 4;

        if(first < 0) {
            first = 0;
        }

        if(last >= tweets.size()) {
            last = tweets.size() - 1;
        }

        return tweets.subList(last, first);

    }
}
