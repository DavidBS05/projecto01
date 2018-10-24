package com.iesemilidarder.dbonnin.projecto01;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class RestaurantBooking extends Product {


    private List <RestaurantBooking> initRestaurantBooking() {
        List<RestaurantBooking> restaurantBookingList = new ArrayList<RestaurantBooking>();
        RestaurantBooking restaurantBooking = new RestaurantBooking();


        return restaurantBookingList;
    }
}
