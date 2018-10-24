package com.iesemilidarder.dbonnin.projecto01;

import java.util.ArrayList;
import java.util.List;

public class RestaurantBooking extends Product {
    private List <RestaurantBooking> initRestaurantBooking() {
        List<RestaurantBooking> restaurantBookingList = new ArrayList<RestaurantBooking>();
        RestaurantBooking restaurantBooking = new RestaurantBooking();
        restaurantBooking.setResPais("España");
        restaurantBooking.setResName("100 Montaditos");
        restaurantBooking.setResPrice(5.0);

        RestaurantBooking restaurantBooking1 = new RestaurantBooking();
        restaurantBooking1.setResPais("España");
        restaurantBooking1.setResName("Skalop");
        restaurantBooking1.setResPrice(7.5);

        RestaurantBooking restaurantBooking2 = new RestaurantBooking();
        restaurantBooking2.setResPais("Francia");
        restaurantBooking2.setResName("Creperie la Chaumiere");
        restaurantBooking2.setResPrice(11.2);

        restaurantBookingList.add(restaurantBooking);
        restaurantBookingList.add(restaurantBooking1);
        restaurantBookingList.add(restaurantBooking2);

        return restaurantBookingList;
    }
}
