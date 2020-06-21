package com.example.gofp.head_first.sol.behavioral.command;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.command.classes.SimpleRemote;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.CeilingFan;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.CeilingFanImpl;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.GarageDoor;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.GarageDoorImpl;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.Light;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.LightImpl;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.StereoCD;
import com.example.gofp.head_first.sol.behavioral.command.classes.action.StereoCDImpl;
import com.example.gofp.head_first.sol.behavioral.command.classes.off.CeilingFanOffCommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.off.GarageDoorCloseCommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.off.LightOffCommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.off.StereoOffCommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.on.CeilingFanOnCommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.on.GarageDoorOpenCommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.on.LightOnCommand;
import com.example.gofp.head_first.sol.behavioral.command.classes.on.StereoOnCommand;

public class Command extends BasePattern {
    @Override
    public void main() {
        SimpleRemote remote = new SimpleRemote();
        // action source
        Light livingRoomLight = new LightImpl("LivingRoom");
        Light kitchenLight = new LightImpl("Kitchen");
        CeilingFan livingRoomFan = new CeilingFanImpl("LivingRoom");
        GarageDoor garageDoor = new GarageDoorImpl("");
        StereoCD stereo = new StereoCDImpl("LivingRoom");
        // command shell
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLighOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLighOff = new LightOffCommand(kitchenLight);
        CeilingFanOnCommand ceilingFanOnCommand =     new CeilingFanOnCommand(livingRoomFan);
        CeilingFanOffCommand ceilingFanOffCommand =     new CeilingFanOffCommand(livingRoomFan);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand( stereo);

        // client
        remote.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remote.setCommand(1,kitchenLighOn,kitchenLighOff);
        remote.setCommand(2,ceilingFanOnCommand,ceilingFanOffCommand);
        remote.setCommand(3, garageOpen,garageClose);
        remote.setCommand(4,stereoOnCommand,stereoOffCommand);

        Systems.out.println(remote);

        remote.onButtonPressed(0);
        remote.offButtonPressed(0);

        remote.onButtonPressed(1);
        remote.offButtonPressed(1);

        remote.onButtonPressed(2);
        remote.offButtonPressed(2);

        remote.onButtonPressed(3);
        remote.offButtonPressed(3);

        remote.onButtonPressed(4);
        remote.offButtonPressed(4);

    }
}
