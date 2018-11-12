package old;

import com.iesemilidarder.dbonnin.projecto01.data.Activity;
import org.apache.commons.collections4.IteratorUtils;

import java.util.ArrayList;
import java.util.List;

public class ActiveActivity extends Activity {

    public static void main(String... args) {
        System.out.println("Chicos a activarse!");

        List<ActiveActivity> actives = new ArrayList<>();

        for (int i=0;i<40;i++) {
            ActiveActivity activeActivity = new ActiveActivity();
            activeActivity.setCountry("pais"+i);
            activeActivity.setArea("area"+i);
            activeActivity.setMunicipality("municipio"+i);
            activeActivity.setPlace("sitio"+i);
            activeActivity.setName("nombre"+i);
            activeActivity.setDuration("duracion"+i);
            actives.add(activeActivity);
        }
        /*
        for (Iterator<ActiveActivity> it = actives.iterator(); it.hasNext(); ) {
            ActiveActivity i = it.next();
        }*/
        for (ActiveActivity i:actives) {

        }
        IteratorUtils.forEach(actives.iterator(), input -> {
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
