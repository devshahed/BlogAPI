package com.zenith.blog.exception;

public class UnAuthorizedException extends RuntimeException {
    public UnAuthorizedException(String msg){
        super(msg);
    }
}
