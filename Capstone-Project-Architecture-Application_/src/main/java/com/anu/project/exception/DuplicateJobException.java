package com.anu.project.exception;

public class DuplicateJobException extends RuntimeException{
    public DuplicateJobException(String msg){
        super(msg);
    }
}
