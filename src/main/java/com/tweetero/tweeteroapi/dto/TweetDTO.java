package com.tweetero.tweeteroapi.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TweetDTO(
    @NotNull @NotBlank @Size(min = 1, max = 30) String username,
    @NotNull @NotBlank @URL String avatar,
    @NotNull @NotBlank @Size(min = 1, max = 200) String tweet
) {
    
}
