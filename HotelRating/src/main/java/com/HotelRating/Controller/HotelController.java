package com.HotelRating.Controller;

import com.HotelRating.Entity.Hotel;
import com.HotelRating.Service.Impl.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelServiceImpl hotelService;


    //create hotel
    @PostMapping
    public ResponseEntity<Hotel> createuser(@RequestBody Hotel hotel) {
        Hotel hotel1 = hotelService.createhotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    //get all hotels
    @GetMapping
    public ResponseEntity<List<Hotel>> getallhotelss() {
        return ResponseEntity.ok(hotelService.getallhotels());
    }

    //getsingle hotel
    @GetMapping("/{Id}")
    public ResponseEntity<Hotel> getonehotel(@PathVariable("Id") Hotel Id) {
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getsinglehotel(Id));
    }
}
