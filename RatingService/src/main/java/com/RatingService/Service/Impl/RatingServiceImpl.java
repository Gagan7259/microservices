package com.RatingService.Service.Impl;

import com.RatingService.Entity.Rating;
import com.RatingService.Repository.RatingRepository;
import com.RatingService.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating createratings(Rating rating) {
        String us= UUID.randomUUID().toString();
        rating.setRatingid(us);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getallratings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingbyuserId(String userId) {
        return ratingRepository.findByuserId(userId);
    }

    @Override
    public List<Rating> getRatingbyhotelId(String hotelId) {
        return ratingRepository.findByhotelId(hotelId);
    }
}
