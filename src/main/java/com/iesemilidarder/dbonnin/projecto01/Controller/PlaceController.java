package com.iesemilidarder.dbonnin.projecto01.Controller;

import com.iesemilidarder.dbonnin.projecto01.Place;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;

public class PlaceController {

    public static void main(String... args) {
        System.out.println("Funciona!!!");

        ArrayList<Place> places = new ArrayList<>();

        for(int i=0;i<40;i++){
            Place placeController = new Place();
            placeController.setCountry("pais"+i);
            placeController.setName("nombre"+i);
            placeController.setPlace("lugar"+i);
            places.add(placeController);
        }
        /*
        for (Iterator<Place> it = places.iterator(); it.hasNext(); ) {
            Place i = it.next();
        }*/
        for (Place i:places){

        }
        IteratorUtils.forEach(places.iterator(),input -> {
            System.out.println(input.getName());
            try{
                //ejecuta insert into places (name,description) values (input.getName(),input.getDescription()
                //commit
            }catch (Exception e){
                //rollback
            }

        });
        System.out.println("Fin...");
    }
}
