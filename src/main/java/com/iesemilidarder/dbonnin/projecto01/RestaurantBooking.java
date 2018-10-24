package com.iesemilidarder.dbonnin.projecto01;
import com.iesemilidarder.dbonnin.projecto01.Controller.RestaurantController;

import java.util.ArrayList;

public class RestaurantBooking extends Product {

        public static void main(String... args) {
            ArrayList<RestaurantController> restaurantControllerArrayList = new ArrayList<>();
            RestaurantController restaurantController = new RestaurantController();
            restaurantController.setResPais("España");
            restaurantController.setResName("100 Montaditos");
            restaurantController.setResPrice(5.0);
            restaurantController.setResEstrellas(1);

            RestaurantController restaurantController1 = new RestaurantController();
            restaurantController1.setResPais("España");
            restaurantController1.setResName("Skalop");
            restaurantController1.setResPrice(7.5);
            restaurantController1.setResEstrellas(2);

            RestaurantController restaurantBooking2 = new RestaurantBooking();
            restaurantBooking2.setResPais("Francia");
            restaurantBooking2.setResName("Creperie la Chaumiere");
            restaurantBooking2.setResPrice(11.2);
            restaurantBooking2.setResEstrellas(4);

            restaurantBookingArrayList.add(restaurantBooking);
            restaurantBookingArrayList.add(restaurantBooking1);
            restaurantBookingArrayList.add(restaurantBooking2);
 }
}

