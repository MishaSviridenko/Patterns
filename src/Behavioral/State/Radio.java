package Behavioral.State;

import Behavioral.State.Impls.Radio7;
import Behavioral.State.Impls.RadioDFM;
import Behavioral.State.Impls.VestiFM;
import Behavioral.State.Interfaces.Station;

/**
 * Context
 */
class Radio {
    private Station station;

    void setStation(Station st) {
        station = st;
    }

    void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        } else if (station instanceof RadioDFM) {
            setStation(new VestiFM());
        } else if (station instanceof VestiFM) {
            setStation(new Radio7());
        }
    }

    void play() {
        station.play();
    }
}
