package com.HotelRating.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Hotel {
    @Id
    private String hotelid;
    private String name;
    private String location;
    private String about;

}
