import ar.com.ada.abst.abst.Vehicle;
import ar.com.ada.abst.subclass.Airplane;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle airplane1= new Airplane ("Boeing 747", 80, false, "Argentinas");
        Vehicle airplane2= new Airplane ("Boeing 747-b", 50, true, "Conviasa");

        vehicles.add(airplane1);
        vehicles.add(airplane2);

        for (int i = 0; i < vehicles.size(); i++) {
            //get pasa el indice y retorna la lista
            Vehicle tmp = vehicles.get(i);
            System.out.println("tmp.getIsInTheAir() = " + tmp.getIsInTheAir());
        }

//        airplane.touchDown(); //esta en el aire
//        airplane.peelOff(); //empieza el despegue
//        airplane.peelOff(); //ya despegó
//        airplane.touchDown(); //hace el aterrizaje
    }
}
