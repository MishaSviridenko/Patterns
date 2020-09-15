package Behavioral.Visitor.Impls;

import Behavioral.Visitor.Interfaces.Visitor;

public class MechanicVisitor implements Visitor {
    public void visit(EngineElement engine) {
        System.out.println("Test engine.");
    }

    public void visit(BodyElement body) {
        System.out.println("Repare body.");
    }
}
