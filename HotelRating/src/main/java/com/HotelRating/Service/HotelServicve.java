package com.HotelRating.Service;

import com.HotelRating.Entity.Hotel;

import java.util.List;

public interface HotelServicve {

    //create
    Hotel createhotel(Hotel hotel);

    //get all hotels
    List<Hotel> getallhotels();

    //get single hotel
    Hotel getsinglehotel(Hotel hotelId);
}
