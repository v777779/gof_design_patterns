package com.example.gofp.head_first.sol.behavioral.command.classes.off;

import com.example.gofp.head_first.sol.behavioral.command.classes.ICommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.StereoCD;

public class StereoOffCommand implements ICommand {
    private StereoCD stereo;

    public StereoOffCommand(StereoCD stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
