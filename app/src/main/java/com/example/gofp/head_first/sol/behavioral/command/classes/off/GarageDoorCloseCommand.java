package com.example.gofp.head_first.sol.behavioral.command.classes.off;

import com.example.gofp.head_first.sol.behavioral.command.classes.Command;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
