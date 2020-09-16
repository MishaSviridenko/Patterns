package Creational.AbstractFactory.Impls.Ru;

import Creational.AbstractFactory.Interfaces.TouchPad;

public class RuTochpad implements TouchPad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Смещено на " + s + " пикселей");
    }
}
