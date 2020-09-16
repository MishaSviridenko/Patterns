package Creational.Builder.BuilderHard;

import Creational.Builder.BuilderHard.Bean.Car;

class Director {

    CarBuilder builder;

    void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.builderMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}
