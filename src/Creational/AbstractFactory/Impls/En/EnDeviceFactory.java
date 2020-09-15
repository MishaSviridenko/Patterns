package Creational.AbstractFactory.Impls.En;

import Creational.AbstractFactory.Interfaces.DeviceFactory;
import Creational.AbstractFactory.Interfaces.Keyboard;
import Creational.AbstractFactory.Interfaces.Mous;
import Creational.AbstractFactory.Interfaces.TouchPad;

public class EnDeviceFactory implements DeviceFactory {
    @Override
    public Mous getMous() {
        return new EnMous();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public TouchPad getTouchPad() {
        return new EnTochpad();
    }
}
