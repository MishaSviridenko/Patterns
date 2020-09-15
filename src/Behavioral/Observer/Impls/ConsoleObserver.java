package Behavioral.Observer.Impls;

import Behavioral.Observer.Interfaces.Observer;

public class ConsoleObserver implements Observer {
    public void handleEvent(int temp, int presser) {
        System.out.println("Temperatur = " +
                temp + " presser = " + presser);
    }
}
