package com.iesemilidarder.dbonnin.projecto01.old;

import com.iesemilidarder.dbonnin.projecto01.data.Activity;
import org.apache.commons.collections4.IteratorUtils;

import java.util.ArrayList;
import java.util.List;

public class SchoolActivity extends Activity {

    public static void main(String... args) {
        System.out.println("Niños salid del autobus!");

        List<SchoolActivity> schools = new ArrayList<>();

        for (int i=0;i<40;i++) {
            SchoolActivity schoolActivity = new SchoolActivity();
            schoolActivity.setCountry("pais"+i);
            schoolActivity.setArea("area"+i);
            schoolActivity.setMunicipality("municipio"+i);
            schoolActivity.setPlace("sitio"+i);
            schoolActivity.setName("nombre"+i);
            schoolActivity.setDuration("duracion"+i);
            schools.add(schoolActivity);
        }
        /*
        for (Iterator<SchoolActivity> it = schools.iterator(); it.hasNext(); ) {
            SchoolActivity i = it.next();
        }*/
        for (SchoolActivity i:schools) {

        }
        IteratorUtils.forEach(schools.iterator(), input -> {
            System.out.println(input.getName());
            try{
                //ejecuta insert into places (name,description) values (input.getName(),input.getDescription()
                //commit
            }catch (Exception e){
                //rollback
            }

        });
        System.out.println("De vuelta al autobus...");
    }
}
