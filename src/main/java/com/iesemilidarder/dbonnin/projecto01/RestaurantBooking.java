package com.iesemilidarder.dbonnin.projecto01;

import java.util.ArrayList;
import java.util.List;

public class RestaurantBooking extends Product {
    private List <RestaurantBooking> initRestaurantBooking() {
        List<RestaurantBooking> restaurantBookingList = new ArrayList<RestaurantBooking>();
        RestaurantBooking restaurantBooking = new RestaurantBooking();
        restaurantBooking.setResPais("null");
        restaurantBooking.setResName("null");
        restaurantBooking.setResPrice(null);

        return restaurantBookingList;
    }
}
