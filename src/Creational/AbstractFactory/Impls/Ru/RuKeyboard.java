package Creational.AbstractFactory.Impls.Ru;

import Creational.AbstractFactory.Interfaces.Keyboard;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Печатать");
    }

    @Override
    public void println() {
        System.out.println("Печатать линию");
    }
}
