package com.iesemilidarder.dbonnin.projecto01.Controller;

import com.iesemilidarder.dbonnin.projecto01.Activity;
import com.iesemilidarder.dbonnin.projecto01.HotelBooking;
import com.iesemilidarder.dbonnin.projecto01.RestaurantBooking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerProduct {
    @RequestMapping("/restaurantBooking")
    public RestaurantBooking getRestaurantBooking(@RequestParam(value = "name", defaultValue = "World") String activityKind) {
        RestaurantBooking restaurantBooking = new RestaurantBooking();
        restaurantBooking.setActivityKind(activityKind);
        return restaurantBooking;
    }

    @RequestMapping("/hotelBooking")
    public HotelBooking getHotelBooking(@RequestParam(value = "name", defaultValue = "World") String activityKind) {
        HotelBooking hotelBooking = new HotelBooking();
        hotelBooking.setActivityKind(activityKind);
        return hotelBooking;
    }
}
