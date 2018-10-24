package com.iesemilidarder.dbonnin.projecto01.Controller;

import com.iesemilidarder.dbonnin.projecto01.Activity;
import com.iesemilidarder.dbonnin.projecto01.RestaurantBooking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @RequestMapping("/restaurantBooking")
    public RestaurantBooking getRestaurantBooking(@RequestParam(value = "name", defaultValue = "World") String activityKind) {
        RestaurantBooking restaurantBooking = new RestaurantBooking();
        restaurantBooking.setActivityKind(activityKind);
        return restaurantBooking;
    }
}
