package Structural.Bridge;

public abstract class Car {
    protected Mark mark;

    public Car(Mark m) {
        mark = m;
    }

    public abstract void showDetails();
}
