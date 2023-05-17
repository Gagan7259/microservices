package com.RatingService.Service;

import com.RatingService.Entity.Rating;

import java.util.List;

public interface RatingService {
    //create rating
    Rating createratings(Rating rating);

    //get all ratings
    List<Rating> getallratings();

    //getting userid
    List<Rating> getRatingbyuserId(String userId);

    //getting hotelid
    List<Rating> getRatingbyhotelId(String hotelId);

}
