package Creational.FactoryMethod.Impls;

import Creational.FactoryMethod.Interfaces.Watch;
import Creational.FactoryMethod.Interfaces.WatchMaker;

public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
