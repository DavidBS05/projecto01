package com.iesemilidarder.dbonnin.projecto01.old;

import com.iesemilidarder.dbonnin.projecto01.data.Activity;
import org.apache.commons.collections4.IteratorUtils;

import java.util.ArrayList;
import java.util.List;

public class ActivityController {

    public static void main(String... args) {
        System.out.println("Ha moverse vagos!!");

        List<Activity> activities = new ArrayList<>();

        for (int i=0;i<40;i++) {
            Activity activityController = new Activity();
            activityController.setCountry("pais"+i);
            activityController.setArea("area"+i);
            activityController.setMunicipality("municipio"+i);
            activityController.setPlace("sitio"+i);
            activityController.setTypeActivity("tipo actividad"+i);
            activityController.setName("nombre"+i);
            activityController.setDuration("duracion"+i);
            activities.add(activityController);
        }
        /*
        for (Iterator<Activity> it = activities.iterator(); it.hasNext(); ) {
            Activity i = it.next();
        }*/
        for (Activity i:activities) {

        }
        IteratorUtils.forEach(activities.iterator(), input -> {
            System.out.println(input.getName());
            System.out.println(input.getPlace());
            try{
                //ejecuta insert into places (name,description) values (input.getName(),input.getDescription()
                //commit
            }catch (Exception e){
                //rollback
            }

        });
        System.out.println("Al fin");
    }
}
