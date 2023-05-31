package com.anu.project.exception;

public class InvalidApplicationException extends RuntimeException{
    public InvalidApplicationException(String msg){
        super(msg);
    }
}
