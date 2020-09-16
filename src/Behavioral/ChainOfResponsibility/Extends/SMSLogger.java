package Behavioral.ChainOfResponsibility.Extends;

import Behavioral.ChainOfResponsibility.Logger;

public class SMSLogger extends Logger {
    public SMSLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("SMS" + message);
    }
}
