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

        HotelController hotelController1 = new HotelController();
        hotelController1.setCountry("");
        hotelController1.setName("");
        hotelController1.setNumber(1);
        hotelController1.setFloor(2);
        hotelController1.setPrice(1.1);

        HotelController hotelController2 = new HotelController();
        hotelController2.setCountry("");
        hotelController2.setName("");
        hotelController2.setNumber(1);
        hotelController2.setFloor(1);
        hotelController2.setPrice(1.1);

        hotelControllerArrayList.add(hotelController);
        hotelControllerArrayList.add(hotelController);
        hotelControllerArrayList.add(hotelController);

        System.out.println("Fin!");
    }
}
