package com.iesemilidarder.dbonnin.projecto01.Controller;

import com.iesemilidarder.dbonnin.projecto01.HotelBooking;
import org.apache.commons.collections4.IteratorUtils;

import java.util.ArrayList;
import java.util.List;

public class HotelController {

    public static void main(String... args) {
        System.out.println("Funciona!");

        List<HotelBooking> hotels = new ArrayList<>();

        for (int i=0;i<40;i++) {
            HotelBooking hotelController = new HotelBooking();
            hotelController.setCountry("pais"+i);
            hotelController.setName("name"+i);
            hotelController.setNumber(1+i);
            hotelController.setFloor(1+i);
            hotelController.setPrice(1.2+i);
            hotels.add(hotelController);
        }
        /*
        for (Iterator<HotelBooking> it = hotels.iterator(); it.hasNext(); ) {
            HotelBooking i = it.next();
        }*/
        for (HotelBooking i:hotels){

        }
        IteratorUtils.forEach(hotels.iterator(), input -> {
            System.out.println(input.getName());
            try{
                //ejecuta insert into places (name,description) values (input.getName(),input.getDescription()
                //commit
            }catch (Exception e){
                //rollback
            }

        });
        System.out.println("Fin!");
    }
}
