package Behavioral.Visitor;

import Behavioral.Visitor.Impls.BodyElement;
import Behavioral.Visitor.Impls.EngineElement;
import Behavioral.Visitor.Impls.HooliganVisitor;
import Behavioral.Visitor.Interfaces.Element;
import Behavioral.Visitor.Interfaces.Visitor;

/**
 * Описывает операцию, выполняемую с каждым объектом из некоторой
 * структуры. Паттерн посетитель позволяет определить новую операцию,
 * не изменяя классы этих объектов.
 */
public class Main {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor hooligan = new HooliganVisitor();

        body.accept(hooligan);
        engine.accept(hooligan);
    }
}
