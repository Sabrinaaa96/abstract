import ar.com.ada.abst.abst.Vehicle;
import ar.com.ada.abst.subclass.Airplane;
public class App {
    public static void main(String[] args) {
        Vehicle airplane= new Airplane ("Boeing 747", 80, false, "Argentinas");

        airplane.touchDown(); //esta en el aire
        airplane.peelOff(); //empieza el despegue
        airplane.peelOff(); //ya despegó
        airplane.touchDown(); //hace el aterrizaje
    }
}
