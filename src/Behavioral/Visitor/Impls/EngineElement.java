package Behavioral.Visitor.Impls;

import Behavioral.Visitor.Interfaces.Element;
import Behavioral.Visitor.Interfaces.Visitor;

public class EngineElement implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
