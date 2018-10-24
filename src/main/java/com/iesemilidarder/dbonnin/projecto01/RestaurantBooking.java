package com.iesemilidarder.dbonnin.projecto01;

import java.util.ArrayList;
import java.util.List;

public class RestaurantBooking extends Product {

        public static void main(String... args) {
            ArrayList<RestaurantBooking> restaurantBookingArrayList = new ArrayList<>();
            RestaurantBooking restaurantBooking = new RestaurantBooking();
            restaurantBooking.setResPais("España");
            restaurantBooking.setResName("100 Montaditos");
            restaurantBooking.setResPrice(5.0);
            restaurantBooking.setResEstrellas(1);

            RestaurantBooking restaurantBooking1 = new RestaurantBooking();
            restaurantBooking1.setResPais("España");
            restaurantBooking1.setResName("Skalop");
            restaurantBooking1.setResPrice(7.5);
            restaurantBooking1.setResEstrellas(2);

            RestaurantBooking restaurantBooking2 = new RestaurantBooking();
            restaurantBooking2.setResPais("Francia");
            restaurantBooking2.setResName("Creperie la Chaumiere");
            restaurantBooking2.setResPrice(11.2);
            restaurantBooking2.setResEstrellas(4);

            restaurantBookingArrayList.add(restaurantBooking);
            restaurantBookingArrayList.add(restaurantBooking1);
            restaurantBookingArrayList.add(restaurantBooking2);
        }
    }
}
