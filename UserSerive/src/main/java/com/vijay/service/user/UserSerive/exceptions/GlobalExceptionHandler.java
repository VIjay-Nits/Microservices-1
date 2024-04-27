package com.vijay.service.user.UserSerive.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.vijay.service.user.UserSerive.payload.APIResponse;

public class GlobalExceptionHandler {

    public ResponseEntity<APIResponse> handleResultNotFoundException(ResultNotFoundException ex){

        String message = ex.getMessage();
        APIResponse response = APIResponse.builder()
                                            .message(message)
                                            .success(true)
                                            .status(HttpStatus.NOT_FOUND)
                                            .build();
        return new ResponseEntity<APIResponse>(response, 
                        HttpStatus.NOT_FOUND);

    }
}
