package Behavioral.State;

import Behavioral.State.Impls.RadioDFM;
import Behavioral.State.Interfaces.Station;

/**
 * Состояние - позволяет объекту изменять свое поведение в
 * зависимости от внутреннего состояния. Создается впечатление,
 * что объект изменил свой класс. Паттерн State является
 * объектно-ориентированной реализацией конечного автомата.
 */
public class Main {
    public static void main(String[] args) {
        Station dfm = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(dfm);
        for (int i = 0; i < 10; i++) {
            radio.nextStation();
            radio.play();
        }
    }
}
