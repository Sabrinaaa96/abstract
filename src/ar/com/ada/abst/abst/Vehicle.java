package ar.com.ada.abst.abst;

import java.util.Objects;

public abstract class Vehicle {
    //attr
    protected String model;
    protected Integer seats;
    private Boolean isInTheAir;

    //constructores
    public Vehicle() {
    }

    public Vehicle(String model, Integer seats, Boolean isInTheAir) {
        this.model = model;
        this.seats = seats;
        this.isInTheAir = isInTheAir;
    }

    //getter and setter
    public String getModel() {
        return this.model;
    }

    public Integer getSeats() {
        return this.seats;
    }

    public Boolean getIsInTheAir() {
        return this.isInTheAir;
    }

    public void setModel(String brand) {

        this.model = model;
    }

    public void setSeats(Integer seats) {

        this.seats = seats;
    }

    public void setIsInTheAir(Boolean isInTheAir) {

        this.isInTheAir = isInTheAir;
    }

    //metodo con firma sin cuerpo
    public abstract void peelOff();

    public abstract void touchDown();

    //sobreescritura
    @Override
    public String toString() {
        return "Vehicle [ model = " + model + " , seats = " + seats + " , intheair = " + isInTheAir + "] ";
    }

    public int hashCode() {
        return -12 * Objects.hash(this.model, this.seats, this.isInTheAir);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Vehicle)) {
            return false;
        }

        Vehicle that = (Vehicle) obj;

        boolean tmp = this.model.equals(that.model) &&
                this.seats.equals(that.seats) &&
                this.isInTheAir.equals(that.isInTheAir);
        return tmp;
    }
}
