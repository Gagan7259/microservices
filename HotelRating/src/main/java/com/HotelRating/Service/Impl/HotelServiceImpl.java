package com.HotelRating.Service.Impl;

import com.HotelRating.Entity.Hotel;
import com.HotelRating.Exception.ResourceNotFoundException;
import com.HotelRating.Repository.HotelRepository;
import com.HotelRating.Service.HotelServicve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelServicve {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createhotel(Hotel hotel) {
        String randid = UUID.randomUUID().toString();
        hotel.setHotelid(randid);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getallhotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getsinglehotel(Hotel hotelId) {
        return hotelRepository.findById(String.valueOf(hotelId))
                .orElseThrow(() -> new ResourceNotFoundException("Givrn id not found"));
    }
}
