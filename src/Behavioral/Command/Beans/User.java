package Behavioral.Command.Beans;

import Behavioral.Command.Interfaces.Command;

public class User {
    Command start;
    Command stop;
    Command reset;

    public User(Command start, Command stop, Command reset) {
        this.reset = reset;
        this.start = start;
        this.stop = stop;
    }

    public void startComputer() {
        start.execute();
    }

    public void stopComputer() {
        stop.execute();
    }

    public void resetComputer() {
        reset.execute();
    }

}
