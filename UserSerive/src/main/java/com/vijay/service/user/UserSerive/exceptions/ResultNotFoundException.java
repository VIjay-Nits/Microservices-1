package com.vijay.service.user.UserSerive.exceptions;

public class ResultNotFoundException extends RuntimeException {

    public ResultNotFoundException(){
        super("User Not found");
        System.out.println("in the exception");

    }
    public ResultNotFoundException(String message){
        super(message);
        System.out.println("in the exception");
    }
    
}
