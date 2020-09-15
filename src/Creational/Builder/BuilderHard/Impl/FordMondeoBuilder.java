package Creational.Builder.BuilderHard.Impl;

import Creational.Builder.BuilderHard.Bean.Car;
import Creational.Builder.BuilderHard.CarBuilder;
import Creational.Builder.BuilderHard.Enum.Transmission;

public class FordMondeoBuilder extends CarBuilder {
    private Car car;

    @Override
    public void buiderMake() {
        car.setMake("Ford Mondeo");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    public void buildMaxSpeed() {
        car.setMaxSpeed(220);
    }
}
