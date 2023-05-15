package com.HotelRating.Exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource Not found");
    }

    public ResourceNotFoundException(String messsage) {
        super(messsage);
    }

}
