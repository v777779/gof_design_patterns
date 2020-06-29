package com.example.gofp.head_first.sol.behavioral.command.classes.on;

import com.example.gofp.head_first.sol.behavioral.command.classes.ICommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.StereoCD;

public class StereoOnCommand implements ICommand {
    private StereoCD stereo;

    public StereoOnCommand(StereoCD stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
