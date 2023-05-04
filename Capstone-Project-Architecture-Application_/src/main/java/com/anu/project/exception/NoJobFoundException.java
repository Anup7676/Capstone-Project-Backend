package com.anu.project.exception;

public class NoJobFoundException extends RuntimeException{
    
    public NoJobFoundException(String msg){
        super(msg);
    }
}
