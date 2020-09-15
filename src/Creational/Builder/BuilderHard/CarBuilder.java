package Creational.Builder.BuilderHard;

import Creational.Builder.BuilderHard.Bean.Car;

abstract public class CarBuilder {
    Car car;
    void createCar(){
        car = new Car();
    }

    public abstract void buiderMake();
    public abstract void buildTransmission();
    public abstract void buildMaxSpeed();

    Car getCar(){
        return car;
    }
}
