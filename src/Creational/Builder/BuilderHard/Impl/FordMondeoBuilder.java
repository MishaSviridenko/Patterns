package Creational.Builder.BuilderHard.Impl;

import Creational.Builder.BuilderHard.CarBuilder;
import Creational.Builder.BuilderHard.Enum.Transmission;

public class FordMondeoBuilder extends CarBuilder {

    @Override
    public void builderMake() {
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
