package com.tweetero.tweeteroapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.tweetero.tweeteroapi.dto.TweetDTO;
import com.tweetero.tweeteroapi.models.Tweet;
import com.tweetero.tweeteroapi.services.TweetService;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetService tweetService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.OK)
    public String postUserTweet(TweetDTO tweet) {

        tweetService.postTweet(tweet);

        return "OK";

    }
    
    @GetMapping
    public List<Tweet> getTweets(@RequestParam("page") String page) {

        return tweetService.listTweetsByPage(Integer.parseInt(page));

    }

    @GetMapping("/{username}")
    public List<Tweet> getUserTweets(@PathVariable String username) {

        return tweetService.listAllUserTweets(username);

     }
}
