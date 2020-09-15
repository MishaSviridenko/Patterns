package Behavioral.Interpreter.Impls;

import Behavioral.Interpreter.Expression;

public class NumberExpression implements Expression {
    int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int interpret() {
        return number;
    }
}
