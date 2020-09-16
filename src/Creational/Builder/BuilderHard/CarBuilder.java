package Creational.Builder.BuilderHard;

import Creational.Builder.BuilderHard.Bean.Car;

abstract public class CarBuilder {
    public Car car;

    void createCar() {
        car = new Car();
    }

    public abstract void builderMake();

    public abstract void buildTransmission();

    public abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }
}
