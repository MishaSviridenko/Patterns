package Creational.FactoryMethod.Impls;

import Creational.FactoryMethod.Interfaces.Watch;

import java.util.Date;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
