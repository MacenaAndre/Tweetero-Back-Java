package com.tweetero.tweeteroapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tweetero.tweeteroapi.repositories.TweetRepository;
import com.tweetero.tweeteroapi.repositories.UserRepository;

@SpringBootApplication
public class TweeteroapiApplication {

	public static final UserRepository userRepository = new UserRepository();
	public static final TweetRepository tweetRpostitory = new TweetRepository();

	public static void main(String[] args) {
		SpringApplication.run(TweeteroapiApplication.class, args);
	}

	
}
