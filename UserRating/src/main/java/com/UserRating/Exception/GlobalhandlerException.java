package com.UserRating.Exception;

import com.UserRating.Payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalhandlerException {
    @ExceptionHandler(ResourceNotfoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotfoundException(ResourceNotfoundException re) {
        String messsage = re.getMessage();
        ApiResponse response = ApiResponse.builder().message(messsage).status(HttpStatus.NOT_FOUND).success(true).build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
