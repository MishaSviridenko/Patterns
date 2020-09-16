package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Использует разделение для эффективной поддержки множества мелких
 * объектов.
 * <p>
 * Приспособленец - использует разделение для эффективной
 * поддержки множества мелких объектов.
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shF = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shF.getShape("square"));
        shapes.add(shF.getShape("circle"));
        Random random = new Random();
        for (Shape shape : shapes) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            shape.draw(x, y);
        }
    }
}

