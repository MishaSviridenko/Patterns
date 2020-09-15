package Behavioral.Visitor.Impls;

import Behavioral.Visitor.Interfaces.Visitor;

public class HooliganVisitor implements Visitor {
    public void visit(EngineElement engine) {
        System.out.println("On engine.");
    }

    public void visit(BodyElement body) {
        System.out.println("Knock the body.");
    }
}
