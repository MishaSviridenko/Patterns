package Creational.Builder.BuilderHard;

import Creational.Builder.BuilderHard.Bean.Car;
import Creational.Builder.BuilderHard.Impl.FordMondeoBuilder;
import Creational.Builder.BuilderHard.Impl.SubaruBuilder;

/**
 * Отделяет конструирование сложного объекта от его представления,
 * так, что в результате одного и того же процесса конструирования
 * могут получаться разные представления.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());
        Car car = director.buildCar();
        System.out.println(car);

        director.setBuilder(new SubaruBuilder());
        car = director.buildCar();
        System.out.println(car);
    }
}
