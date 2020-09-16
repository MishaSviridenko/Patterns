package Creational.FactoryMethod;

import Creational.FactoryMethod.Impls.DigitalWatchMaker;
import Creational.FactoryMethod.Impls.RomeWatchMaker;
import Creational.FactoryMethod.Interfaces.Watch;
import Creational.FactoryMethod.Interfaces.WatchMaker;

/**
 * Factory Method - Определяет интерфейс для создания объекта,
 * но оставляет подклассам решение о том, какой класс инстанцировать.
 * Фабричный метод позволяет классу делегировать инстанцирование
 * подклассам.
 * <p>
 * Изменяя только одно слово в строке 9
 * (Rome - Digital) мы запускаем тот или иной класс.
 * Если вместо (Rome - Digital) в строке 9 поставить ссылку
 * на строку из .property файла, то изменять вызов классов
 * можно будет в рантайме.
 */
public class Main {
    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Digital");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    private static WatchMaker getMakerByName(String maker) {
        if (maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if (maker.equals("Rome"))
            return new RomeWatchMaker();

        throw new RuntimeException("Not supported watch production line: " + maker);
    }
}
