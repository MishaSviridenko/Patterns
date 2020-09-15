package Creational.AbstractFactory.Impls.Ru;

import Creational.AbstractFactory.Interfaces.DeviceFactory;
import Creational.AbstractFactory.Interfaces.Keyboard;
import Creational.AbstractFactory.Interfaces.Mous;
import Creational.AbstractFactory.Interfaces.TouchPad;

public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mous getMous() {
        return new RuMous();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public TouchPad getTouchPad() {
        return new RuTochpad();
    }
}
