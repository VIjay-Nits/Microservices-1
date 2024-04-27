package com.vijay.service.user.UserSerive.payload;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class APIResponse {
    private String message;
    private boolean success;
    private HttpStatus status;

}
