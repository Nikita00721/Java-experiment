package storage;

import animalworld.Herbivores;
import animalworld.Plants;
import animalworld.Predators;
import form.Formik;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    public static String feeding1( String meatNyam,String travoNyam) {
        java.util.ArrayList<Herbivores> listherb = Forest.getInstance().findAllHerbivores();
        java.util.ArrayList<Predators> listpr = Forest.getInstance().findAllPredator();
        int idMeatNyam=-1,idTravoNyam=-1;
        for (Predators an: listpr){
            if (an.getName()==meatNyam){
                idMeatNyam=an.getId();
            }
        }
        for (Herbivores an: listherb){
            if (an.getName()==travoNyam){
                idTravoNyam=an.getId();
            }
        }

        Forest.getInstance().findAllIdPredators(idMeatNyam).eat(Forest.getInstance().findAllIdHerbivores(idTravoNyam));


        return "Хищник очень плотненько покушал";

    }


    public static String feeding2(String TravoNyam, String Trav) {
        java.util.ArrayList<Herbivores> listherb = Forest.getInstance().findAllHerbivores();
        java.util.ArrayList<Plants> listpl = Forest.getInstance().findAllPlants();
        int idTrav=-1,idTravoNyam=-1;
        for (Herbivores an: listherb){
            if (an.getName()==TravoNyam){
                idTravoNyam=an.getId();
            }
        }
        for (Plants an: listpl){
            if (an.getName()==Trav){
                idTrav=an.getId();
            }
        }

            Forest.getInstance().findAllIdHerbivores(idTravoNyam).eat(Forest.getInstance().findAllIdPlants(idTrav));
            return ("Травояднушка слопал всю траву,которую ему дали");


    }


        public static void exitBut() throws IOException {
            Forest.getInstance().save();
            System.exit(0);
        }
    }

