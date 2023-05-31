package com.anu.project.exception;

public class PastDateException extends RuntimeException{
    public PastDateException(String msg){
        super(msg);
    }
}
