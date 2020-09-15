package Creational.FactoryMethod.Impls;

import Creational.FactoryMethod.Interfaces.Watch;

public class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("VII-XL");
    }
}
