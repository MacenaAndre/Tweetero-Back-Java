package com.tweetero.tweeteroapi.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserDTO(
    @NotNull @NotBlank @Size(min = 1, max = 30) String username,
    @NotNull @NotBlank @URL String avatar
) {
    
}
