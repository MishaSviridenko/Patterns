package Creational.Builder.BuilderHard.Impl;

import Creational.Builder.BuilderHard.Bean.Car;
import Creational.Builder.BuilderHard.CarBuilder;
import Creational.Builder.BuilderHard.Enum.Transmission;

public class SubaruBuilder extends CarBuilder {
    private Car car;

    @Override
    public void buiderMake() {
        car.setMake("Subaru");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    public void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}