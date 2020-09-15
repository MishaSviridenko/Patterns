package Behavioral.Visitor.Interfaces;

import Behavioral.Visitor.Impls.BodyElement;
import Behavioral.Visitor.Impls.EngineElement;

public interface Visitor {
    void visit(EngineElement engine);

    void visit(BodyElement body);
}
