package com.HotelRating.Service.Impl;

import com.HotelRating.Entity.Hotel;
import com.HotelRating.Exception.ResourceNotFoundException;
import com.HotelRating.Repository.HotelRepository;
import com.HotelRating.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createhotel(Hotel hotel) {
        String rrid = UUID.randomUUID().toString();
        hotel.setHotelid(rrid);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getallhotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getone(String id) {
        return hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Given Id Not Found"));
    }
}
