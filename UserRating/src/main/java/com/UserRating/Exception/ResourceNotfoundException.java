package com.UserRating.Exception;

public class ResourceNotfoundException extends RuntimeException {

    public ResourceNotfoundException() {
        super("Resource Not found");
    }

    public ResourceNotfoundException(String message) {
        super(message);
    }
}
