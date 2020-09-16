package Creational.AbstractFactory.Impls.En;

import Creational.AbstractFactory.Interfaces.Mous;

public class EnMous implements Mous {
    @Override
    public void click() {
        System.out.println("Left click");
    }

    @Override
    public void dblClick() {
        System.out.println("Double click");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Scroll up");
        } else if (direction < 0) {
            System.out.println("Scroll down");
        } else {
            System.out.println("No scrolling");
        }
    }
}
