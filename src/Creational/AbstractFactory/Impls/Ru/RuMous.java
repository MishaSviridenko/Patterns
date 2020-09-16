package Creational.AbstractFactory.Impls.Ru;

import Creational.AbstractFactory.Interfaces.Mous;

public class RuMous implements Mous {
    @Override
    public void click() {
        System.out.println("Левый клик");
    }

    @Override
    public void dblClick() {
        System.out.println("Двойной клик");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Скрол вверх");
        } else if (direction < 0) {
            System.out.println("Скрол вниз");
        } else {
            System.out.println("нет прокрутки");
        }
    }
}
