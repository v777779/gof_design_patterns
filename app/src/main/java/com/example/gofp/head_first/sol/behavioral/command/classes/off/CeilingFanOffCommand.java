package com.example.gofp.head_first.sol.behavioral.command.classes.off;

import com.example.gofp.head_first.sol.behavioral.command.classes.ICommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.CeilingFan;

public class CeilingFanOffCommand implements ICommand {
    private CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
       fan.off();
    }
}
