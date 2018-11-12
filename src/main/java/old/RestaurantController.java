package old;

import com.iesemilidarder.dbonnin.projecto01.data.RestaurantBooking;
import org.apache.commons.collections4.IteratorUtils;

import java.util.ArrayList;
import java.util.List;

public class RestaurantController {
    public static void main(String... args) {
        System.out.println("Funciona");

        List<RestaurantBooking> restaurants = new ArrayList<>();

        for (int i=0;i<40;i++) {
            RestaurantBooking restaurantController = new RestaurantBooking();
            restaurantController.setCountry("pais"+i);
            restaurantController.setName("nombre"+i);
            restaurantController.setPrice(5.0+i);
            restaurantController.setStars(1+i);
            restaurants.add(restaurantController);
        }
        /*
        for (Iterator<RestaurantBooking> it = restaurants.iterator(); it.hasNext(); ) {
            RestaurantBooking i = it.next();
        }*/
        for (RestaurantBooking i:restaurants){

        }
        IteratorUtils.forEach(restaurants.iterator(), input -> {
            System.out.println(input.getName());
            try{
                //ejecuta insert into places (name,description) values (input.getName(),input.getDescription()
                //commit
            }catch (Exception e){
                //rollback
            }

        });
        System.out.println("Fin");
    }
}
