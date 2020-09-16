package Structural.Flyweight;

public class Square implements Shape {
    int a = 10;

    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y +
                ") : paint square with coner " + a);
    }
}
