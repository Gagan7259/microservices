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
@RequestMapping("/Hotels")
public class HotelController {
    @Autowired
    private HotelServiceImpl hotelService;

    //create hotel
    @PostMapping
    public ResponseEntity<Hotel> createhotels(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createhotel(hotel));
    }

    //get all hotels
    @GetMapping
    public ResponseEntity<List<Hotel>> getall_hotels() {
        return ResponseEntity.ok(hotelService.getallhotels());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getonehotel(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getone(id));
    }
}
