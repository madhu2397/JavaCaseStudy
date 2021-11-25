package com.casestudy.springboot.Error;

public class WasherNotFoundException extends Exception{
    public WasherNotFoundException() {
        super();
    }

    public WasherNotFoundException(String message) {
        super(message);
    }

    public WasherNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public WasherNotFoundException(Throwable cause) {
        super(cause);
    }

    protected WasherNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
