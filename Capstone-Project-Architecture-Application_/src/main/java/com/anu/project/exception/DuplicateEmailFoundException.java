package com.anu.project.exception;

public class DuplicateEmailFoundException extends RuntimeException {
    public DuplicateEmailFoundException(String msg) {
        super(msg);
    }
}
