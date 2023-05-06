package com.anu.project.exception;

public class JobNotFoundException extends RuntimeException{
    
    public JobNotFoundException(String msg){
        super(msg);
    }
}
