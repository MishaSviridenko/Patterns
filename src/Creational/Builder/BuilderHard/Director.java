package Creational.Builder.BuilderHard;

import Creational.Builder.BuilderHard.Bean.Car;

public class Director {

    CarBuilder builder;
    void setBuilder(CarBuilder builder){
        this.builder = builder;
    }

    Car buildCar (){
        builder.createCar();
        builder.buiderMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}
