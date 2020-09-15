package Creational.AbstractFactory.Interfaces;

public interface DeviceFactory {
    Mous getMous();
    Keyboard getKeyboard();
    TouchPad getTouchPad();
}
