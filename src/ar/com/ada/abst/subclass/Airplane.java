package ar.com.ada.abst.subclass;

import ar.com.ada.abst.abst.Vehicle;

import java.util.Objects;

public class Airplane extends Vehicle {
    //attr
    private String airline;

    //constructores
    public Airplane() {
    }

    public Airplane(String airline) {
        this.airline = airline;
    }

    public Airplane(String model, Integer seats, Boolean isInTheAir, String airline) {
        //atributos de la clase padre
        super(model, seats, isInTheAir);
        this.airline = airline;
    }

    public void setAirplane (String airline) {
        this.airline = airline;
    }

    public String getAirline() {
        return this.airline;
    }

    @Override
    public void peelOff() {
        if (this.getIsInTheAir()) {
            System.out.println("Usted ya despegó hace rato");
        } else {
            System.out.println("Ajusten sus cinturones!!!");
            this.setIsInTheAir(true);
        }
    }

    @Override
    public void touchDown() {
        if (this.getIsInTheAir())
            System.out.println("Esto es un aterrizaje de emergencia!!! NOOO!!");
        else {
            System.out.println("Primero despega");
            this.setIsInTheAir(false);
        }
    }

    @Override
    public String toString() {
        return "Airplane [ airline = " + airline + "] ";
    }

    public int hashCode() {
        return -12 * Objects.hash(this.airline);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Airplane that = (Airplane) obj;
        return airline.equals(that.airline) &&
                super.equals(that);

    }
}
