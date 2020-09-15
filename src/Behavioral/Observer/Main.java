package Behavioral.Observer;

import Behavioral.Observer.Impls.ConsoleObserver;
import Behavioral.Observer.Impls.MeteoStation;

/**
 * Определяет зависимость типа «один ко многим» между объектами
 * таким образом, что при изменении состояния одного объекта все
 * зависящие от него оповещаются об этом и автоматически обновляются.
 * <p>
 * Наблюдатель - Существует интерфейс Observed (наблюдаемый) и его
 * имплементации, которые обязательно имею в себе: список
 * Наблюдателей (Observer), переменные, метод добавить наблюдателя,
 * метод удалить наблюдателя, метод изменения значений переменных и
 * вызов метода Observer.  Так же существует интерфейс Observer
 * (наблюдаемый) и его имплементации, которые обязательно имеют в себе:
 * методд передачи инфы полученной от Observed (инфу можно передавать
 * на консоль, в логФайл, на экран и т.д.).
 */
public class Main {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();
        station.addObserver(new ConsoleObserver());
        station.setMesurements(25, 760);
    }
}
