package Creational.Builder.BuilderSimple;

public class Car {
    String make;
    Transmission transmission;
    int maxSpeed;

    void setMake(String make) {
        this.make = make;
    }
    void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
