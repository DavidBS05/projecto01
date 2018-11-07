package com.iesemilidarder.dbonnin.projecto01.old;

import com.iesemilidarder.dbonnin.projecto01.data.Activity;
import org.apache.commons.collections4.IteratorUtils;

import java.util.ArrayList;
import java.util.List;

public class CulturalActivity extends Activity {

    public static void main(String... args){
        System.out.println("Actividad Cultural");

        List<CulturalActivity> culturals = new ArrayList<>();

        for (int i=0;i<40;i++) {
            CulturalActivity culturalActivity = new CulturalActivity();
            culturalActivity.setCountry("pais"+i);
            culturalActivity.setArea("area"+i);
            culturalActivity.setMunicipality("municipio"+i);
            culturalActivity.setPlace("sitio"+i);
            culturalActivity.setName("nombre"+i);
            culturalActivity.setDuration("duracion"+i);
            culturals.add(culturalActivity);
        }
        /*
        for (Iterator<CulturalActivity> it = culturals.iterator(); it.hasNext(); ) {
            CulturalActivity i = it.next();
        }*/
        for (CulturalActivity i:culturals) {

        }
        IteratorUtils.forEach(culturals.iterator(), input -> {
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
