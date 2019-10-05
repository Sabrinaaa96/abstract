package ar.com.ada.abst.subclass;
import ar.com.ada.abst.abst.Vehicle;

import java.util.Objects;

public class Helicopter extends Vehicle {
    //attr
    private String type;

    //constructores
    public Helicopter() {
    }

    public Helicopter(String type) {
        this.type = type;
    }

    public Helicopter (String model, Integer seats, Boolean isInTheAir) {
        //atributos de la clase padre
        super(model, seats, isInTheAir);
        this.type = type;
    }

    public void setHelicopter (String type) {
        this.type = type;
    }

    public String getHelicopter() {
        return this.type;
    }


    @Override
    public void peelOff() {
        if (this.getIsInTheAir()) {
            System.out.println("");
        } else {
            System.out.println("");
            this.setIsInTheAir(true);
        }
    }

    @Override
    public void touchDown() {
        if (this.getIsInTheAir())
            System.out.println("");
        else {
            System.out.println("");
            this.setIsInTheAir(false);
        }
    }

    @Override
    public String toString() {
        return "Helicopter [ type = " + type + "] ";
    }

    public int hashCode() {
        return -12 * Objects.hash(this.type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Helicopter that = (Helicopter) obj;

        return type.equals(that.type) &&
                super.equals(that);

    }
}


