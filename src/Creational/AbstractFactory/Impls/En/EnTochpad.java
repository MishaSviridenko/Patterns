package Creational.AbstractFactory.Impls.En;

import Creational.AbstractFactory.Interfaces.TouchPad;

public class EnTochpad implements TouchPad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Moved " +s+ " pixels");
    }
}
