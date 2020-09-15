package Behavioral.Command.Impls;

import Behavioral.Command.Comp;
import Behavioral.Command.Interfaces.Command;

/**
 * ConcreteCommand
 */
public class StopCommand implements Command {
    Comp comp;

    public StopCommand(Comp computer) {
        this.comp = computer;
    }

    public void execute() {
        comp.stop();
    }

}
