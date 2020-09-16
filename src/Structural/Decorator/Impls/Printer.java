package Structural.Decorator.Impls;

import Structural.Decorator.PrintInterface;

public class Printer implements PrintInterface {
    String value;

    public Printer(String v) {
        this.value = v;
    }

    public void print() {
        System.out.print(value);
    }
}
