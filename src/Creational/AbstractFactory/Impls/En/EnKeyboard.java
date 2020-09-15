package Creational.AbstractFactory.Impls.En;

import Creational.AbstractFactory.Interfaces.Keyboard;

public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void println() {
        System.out.println("Print Line");
    }
}
