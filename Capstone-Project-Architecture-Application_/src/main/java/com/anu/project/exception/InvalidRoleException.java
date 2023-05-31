package com.anu.project.exception;

public class InvalidRoleException extends RuntimeException{
    public InvalidRoleException(String msg){
        super(msg);
    }
}
