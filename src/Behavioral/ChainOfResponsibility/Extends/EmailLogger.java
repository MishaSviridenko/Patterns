package Behavioral.ChainOfResponsibility.Extends;

import Behavioral.ChainOfResponsibility.Logger;

public class EmailLogger extends Logger {
    public EmailLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Email" + message);
    }
}
