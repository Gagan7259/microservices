package com.RatingService.Controller;

import com.RatingService.Entity.Rating;
import com.RatingService.Service.Impl.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
@Autowired
    private  RatingServiceImpl ratingServiceImpl;
    //create ratings
    @PostMapping
    public ResponseEntity<Rating> createrating(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceImpl.createratings(rating));
    }

    //get all ratings
    @GetMapping
    public ResponseEntity<List<Rating>> getallrating() {
        return ResponseEntity.ok(ratingServiceImpl.getallratings());
    }

    //get all users
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByuserid(@PathVariable String userId) {
        return ResponseEntity.ok(ratingServiceImpl.getRatingbyuserId(userId));
    }

    //get all hotels
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByhotelid(@PathVariable String hotelId) {
        return ResponseEntity.ok(ratingServiceImpl.getRatingbyhotelId(hotelId));
    }

}
