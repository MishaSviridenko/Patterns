package Creational.AbstractFactory;

import Creational.AbstractFactory.Impls.En.EnDeviceFactory;
import Creational.AbstractFactory.Impls.Ru.RuDeviceFactory;
import Creational.AbstractFactory.Interfaces.DeviceFactory;
import Creational.AbstractFactory.Interfaces.Keyboard;
import Creational.AbstractFactory.Interfaces.Mous;
import Creational.AbstractFactory.Interfaces.TouchPad;

/**
 * Abstract Factory - объединяет группу обычных фабрик (FactoryMethod).
 *
 * Смысл в том, что есть пары (или больше) одинаковых классов
 * Keyboard, Mouse, Touchpad. Каждая пара классов имеет английскую
 * и русскую реализации. Т.е. обычная Фабрика №1 реализует русскую
 * версию классов, обычная Фабрика №2 реализует английскую версию
 * классов, а Abstract Factory объединяет эти две фабрики.
 */
public class Main {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("RU");
        Mous mous = factory.getMous();
        Keyboard keyboard = factory.getKeyboard();
        TouchPad touchPad = factory.getTouchPad();

        mous.click();
        keyboard.print();
        keyboard.println();
        touchPad.track(10, 35);
    }
    private static DeviceFactory getFactoryByCountryCode(String lang){
        switch (lang){
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
                default:
                    throw new RuntimeException("Unsupported country code: " + lang);
        }
    }
}
