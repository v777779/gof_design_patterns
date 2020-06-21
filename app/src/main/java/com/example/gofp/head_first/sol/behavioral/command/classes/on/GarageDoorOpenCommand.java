package com.example.gofp.head_first.sol.behavioral.command.classes.on;

import com.example.gofp.head_first.sol.behavioral.command.classes.Command;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
