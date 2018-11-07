package com.iesemilidarder.dbonnin.projecto01.controller;

import com.iesemilidarder.dbonnin.projecto01.DataHelper;
import com.iesemilidarder.dbonnin.projecto01.data.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @RequestMapping("/getAll")
    public List<Product> getAll() {
        return DataHelper.items;
    }

    @RequestMapping("/activity")
    public Activity getActivity(@RequestParam(value = "name", defaultValue = "World") String activityKind) {
        Activity activity = new Activity();
        activity.setActivityKind(activityKind);
        DataHelper.items.add(activity);
        return activity;
    }

    @RequestMapping("/hotelBooking")
    public HotelBooking getHotelBooking(@RequestParam(value = "name", defaultValue = "World") String company) {
        HotelBooking hotelBooking = new HotelBooking();
        hotelBooking.setCompany(company);
        DataHelper.items.add(hotelBooking);
        return hotelBooking;
    }

    @RequestMapping("/place")
    public Place getPlace(@RequestParam(value = "name", defaultValue = "World") String geographicalPoint) {
        Place place = new Place();
        place.setGeographicalPoint(geographicalPoint);
        DataHelper.items.add(place);
        return place;
    }

    @RequestMapping("/restaurantBooking")
    public RestaurantBooking getRestaurantBooking(@RequestParam(value = "name", defaultValue = "World") String company) {
        RestaurantBooking restaurantBooking = new RestaurantBooking();
        restaurantBooking.setCompany(company);
        DataHelper.items.add(restaurantBooking);
        return restaurantBooking;
    }
}
