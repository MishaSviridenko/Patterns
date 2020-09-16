package Structural.Decorator.Extends;

import Structural.Decorator.Impls.Decorator;
import Structural.Decorator.PrintInterface;

public class RightBracketDecorator extends Decorator {
    public RightBracketDecorator(PrintInterface c) {
        super(c);
    }

    public void print() {
        super.print();
        System.out.print("]");
    }
}