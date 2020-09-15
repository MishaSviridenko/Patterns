package Structural.Bridge;

import Structural.Bridge.Beans.Skoda;
import Structural.Bridge.Impls.Hatchback;

/**
 * Мост - Отделить абстракцию от ее реализации так, чтобы
 * то и другое можно было изменять независимо.
 */
public class Main {
    public static void main(String[] args) {
        Car c = new Hatchback(new Skoda());
        c.showDetails();
    }
}