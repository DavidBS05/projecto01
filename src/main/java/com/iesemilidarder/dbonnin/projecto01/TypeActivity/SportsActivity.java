package com.iesemilidarder.dbonnin.projecto01.TypeActivity;

import com.iesemilidarder.dbonnin.projecto01.Activity;
import org.apache.commons.collections4.IteratorUtils;

import java.util.ArrayList;
import java.util.List;

public class SportsActivity extends Activity {

    public static void main(String... args) {
        System.out.println("A entrenar!");

        List<SportsActivity> sports = new ArrayList<>();

        for (int i=0;i<40;i++) {
            SportsActivity sportsActivity = new SportsActivity();
            sportsActivity.setCountry("pais"+i);
            sportsActivity.setArea("area"+i);
            sportsActivity.setMunicipality("municipio"+i);
            sportsActivity.setPlace("sitio"+i);
            sportsActivity.setName("nombre"+i);
            sportsActivity.setDuration("duracion"+i);
            sports.add(sportsActivity);
        }
        /*
        for (Iterator<SportsActivity> it = sports.iterator(); it.hasNext(); ) {
            SportsActivity i = it.next();
        }*/
        for (SportsActivity i:sports) {

        }
        IteratorUtils.forEach(sports.iterator(), input -> {
            System.out.println(input.getName());
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
