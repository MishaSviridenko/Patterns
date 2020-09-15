package Creational.Builder.BuilderSimple;

public class CarBuilder {

    String make = "Default";
    Transmission transmission = Transmission.MANUAL;
    int maxSpeed = 100;

    CarBuilder buildMake (String m){
        this.make = m;
        return this;
    }

    CarBuilder buildTransmission (Transmission tr){
        this.transmission = tr;
        return this;
    }

    CarBuilder BuildMaxSpeed (int speed){
        this.maxSpeed = speed;
        return this;
    }

    Car build(){
        Car car = new Car();
        car.setMake(make);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);
        return car;
    }
}
