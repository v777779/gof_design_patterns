package com.example.gofp.head_first.sol.behavioral.command.classes.on;

import com.example.gofp.head_first.sol.behavioral.command.classes.ICommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.CeilingFan;

public class CeilingFanOnCommand implements ICommand {
    private CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
       fan.on();
    }
}
