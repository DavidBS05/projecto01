package com.iesemilidarder.dbonnin.projecto01;
import com.iesemilidarder.dbonnin.projecto01.Controller.RestaurantController;

import java.util.ArrayList;

public class RestaurantBooking extends Product {
        public static void main(String... args) {
            System.out.println("Funciona");

            ArrayList<RestaurantController> restaurantControllerArrayList = new ArrayList<>();
            RestaurantController restaurantController = new RestaurantController();
            restaurantController.setCountry("España");
            restaurantController.setName("100 Montaditos");
            restaurantController.setPrice(5.0);
            restaurantController.setStars(1);

            RestaurantController restaurantController1 = new RestaurantController();
            restaurantController1.setCountry("España");
            restaurantController1.setName("Skalop");
            restaurantController1.setPrice(7.5);
            restaurantController1.setStars(2);

            RestaurantController restaurantController2 = new RestaurantController();
            restaurantController2.setCountry("Francia");
            restaurantController2.setName("Creperie la Chaumiere");
            restaurantController2.setPrice(11.2);
            restaurantController2.setStars(4);

            restaurantControllerArrayList.add(restaurantController);
            restaurantControllerArrayList.add(restaurantController1);
            restaurantControllerArrayList.add(restaurantController2);

            for (int x=0;x<restaurantControllerArrayList.size();x++) {
                System.out.println(restaurantControllerArrayList.get(x));
            }

            System.out.println("Fin");
        }
}

