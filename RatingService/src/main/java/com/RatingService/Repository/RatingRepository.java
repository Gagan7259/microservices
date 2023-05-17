package com.RatingService.Repository;

import com.RatingService.Entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {

    List<Rating> findByuserId(String userId);
    List<Rating> findByhotelId(String hotelId);

}
