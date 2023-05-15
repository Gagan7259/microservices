package com.HotelRating.Service;

import com.HotelRating.Entity.Hotel;

import java.util.List;

public interface HotelService {
    //create hotel

    Hotel createhotel(Hotel hotel);

    //get all hotels
    List<Hotel> getallhotels();

    //getsingle hotel
    Hotel getone(String id);
}
