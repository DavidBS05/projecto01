package com.iesemilidarder.dbonnin.projecto01;

import com.iesemilidarder.dbonnin.projecto01.Controller.HotelController;

import java.util.ArrayList;

public class HotelBooking extends Product {

    public static void main(String... args) {
        System.out.println("Funciona!");

        ArrayList<HotelController> hotelControllerArrayList = new ArrayList<>();
        HotelController hotelController = new HotelController();
        hotelController.setCountry("");
        hotelController.setName("");
        hotelController.setNumber(1);
        hotelController.setFloor(1);
        hotelController.setPrice(1.2);

        hotelControllerArrayList.add(hotelController);

        System.out.println("Fin!");
    }
}
