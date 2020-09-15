package Structural.Flyweight;

public class Circle implements Shape {
    int r=5;
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y +
                ") : paint circle with diametr " + r);
    }
}
