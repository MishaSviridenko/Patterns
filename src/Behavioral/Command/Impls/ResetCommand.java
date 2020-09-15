package Behavioral.Command.Impls;

import Behavioral.Command.Comp;
import Behavioral.Command.Interfaces.Command;

/**
 * ConcreteCommand
 */
public class ResetCommand implements Command {
    Comp comp;

    public ResetCommand(Comp computer) {
        this.comp = computer;
    }

    public void execute() {
        comp.reset();
    }
}
