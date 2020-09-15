package Behavioral.Observer.Impls;

import Behavioral.Observer.Interfaces.Observed;
import Behavioral.Observer.Interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {
    int temperature;
    int presser;
    List<Observer> observers = new ArrayList<>();

    public void setMesurements(int temt, int presser) {
        this.temperature = temt;
        this.presser = presser;
        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.handleEvent(temperature, presser);
        }
    }
}
