package Structural.Decorator.Impls;

import Structural.Decorator.PrintInterface;

public class Decorator implements PrintInterface {
    PrintInterface component;

    public Decorator(PrintInterface c) {
        this.component = c;
    }

    public void print() {
        component.print();
    }
}
