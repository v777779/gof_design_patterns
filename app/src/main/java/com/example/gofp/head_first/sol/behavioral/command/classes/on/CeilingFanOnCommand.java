package com.example.gofp.head_first.sol.behavioral.command.classes.on;

import com.example.gofp.head_first.sol.behavioral.command.classes.Command;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.CeilingFan;

public class CeilingFanOnCommand implements Command {
    private CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
       fan.on();
    }
}
