package com.example.gofp.head_first.sol.behavioral.command.classes.on;

import com.example.gofp.head_first.sol.behavioral.command.classes.ICommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.Light;

public class LightOnCommand  implements ICommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
