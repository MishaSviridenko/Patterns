package Structural.Decorator.Extends;

import Structural.Decorator.Impls.Decorator;
import Structural.Decorator.PrintInterface;

public class LeftBracketDecorator extends Decorator {
    public LeftBracketDecorator(PrintInterface c) {
        super(c);
    }

    public void print() {
        System.out.print("[");
        super.print();
    }
}