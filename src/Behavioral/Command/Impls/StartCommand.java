package Behavioral.Command.Impls;

import Behavioral.Command.Comp;
import Behavioral.Command.Interfaces.Command;

/**
 * ConcreteCommand
 */
public class StartCommand implements Command {
    Comp comp;

    public StartCommand(Comp computer) {
        this.comp = computer;
    }

    public void execute() {
        comp.start();
    }
}
