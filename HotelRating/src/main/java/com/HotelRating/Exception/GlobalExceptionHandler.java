package com.HotelRating.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    public ResponseEntity<Map<String, Object>> handlerException( ResourceNotFoundException r) {
        Map map = new HashMap<>();
        map.put("message", r.getMessage());
        map.put("status", HttpStatus.NOT_FOUND);
        map.put("success", false);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }
}
