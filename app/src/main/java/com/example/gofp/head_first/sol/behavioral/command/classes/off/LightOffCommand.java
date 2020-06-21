package com.example.gofp.head_first.sol.behavioral.command.classes.off;

import com.example.gofp.head_first.sol.behavioral.command.classes.Command;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
