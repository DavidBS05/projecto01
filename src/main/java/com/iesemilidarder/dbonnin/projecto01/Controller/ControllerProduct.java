package com.iesemilidarder.dbonnin.projecto01.Controller;

import com.iesemilidarder.dbonnin.projecto01.Activity;
import com.iesemilidarder.dbonnin.projecto01.HotelBooking;
import com.iesemilidarder.dbonnin.projecto01.Place;
import com.iesemilidarder.dbonnin.projecto01.RestaurantBooking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerProduct {
    @RequestMapping("/activity")
    public Activity getActivity(@RequestParam(value = "name", defaultValue = "World") String acivityKind) {
        Activity activity = new Activity();
        activity.setActivityKind(acivityKind);
        return activity;
    }

    @RequestMapping("/hotelBooking")
    public HotelBooking getHotelBooking(@RequestParam(value = "name", defaultValue = "World") String company) {
        HotelBooking hotelBooking = new HotelBooking();
        hotelBooking.setCompany(company);
        return hotelBooking;
    }

    @RequestMapping("/place")
    public Place getPlace(@RequestParam(value = "name", defaultValue = "World") String geographicalPoint) {
        Place place = new Place();
        place.setGeographicalPoint(geographicalPoint);
        return place;
    }

    @RequestMapping("/restaurantBooking")
    public RestaurantBooking getRestaurantBooking(@RequestParam(value = "name", defaultValue = "World") String company) {
        RestaurantBooking restaurantBooking = new RestaurantBooking();
        restaurantBooking.setCompany(company);
        return restaurantBooking;
    }
}
