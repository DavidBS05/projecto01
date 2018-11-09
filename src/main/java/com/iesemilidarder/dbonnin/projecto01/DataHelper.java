package com.iesemilidarder.dbonnin.projecto01;

import com.iesemilidarder.dbonnin.projecto01.data.*;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {
    public static List<Product> items = new ArrayList<>();

    public static List<Product> getData () {
        doInit();
        return items;
    }

    public static void insert (Product product) {
        items.add(product);
    }

    private static void doInit() {
        if (items.isEmpty()){
            for (int i =0;i<40;i++) {
                Activity activity = new Activity();
                activity.setCountry("pais"+i);
                items.add(activity);

                HotelBooking hotelBooking = new HotelBooking();
                hotelBooking.setCountry("pais"+i);
                items.add(hotelBooking);

                Place place = new Place();
                place.setCountry("pais"+i);
                items.add(place);

                RestaurantBooking restaurantBooking = new RestaurantBooking();
                restaurantBooking.setCountry("pais"+i);
                items.add(restaurantBooking);

                doInit();
            }
        }
    }
}
