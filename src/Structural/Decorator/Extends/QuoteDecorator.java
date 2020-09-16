package Structural.Decorator.Extends;

import Structural.Decorator.Impls.Decorator;
import Structural.Decorator.PrintInterface;

public class QuoteDecorator extends Decorator {
    public QuoteDecorator(PrintInterface c) {
        super(c);
    }

    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}