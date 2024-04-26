package com.vijay.service.user.exceptions;

public class ResultNotFoundException extends RuntimeException {

    public ResultNotFoundException(){
        super("User Not found");

    }
    public ResultNotFoundException(String message){
        super(message);
    }
    
}
