package com.example.gofp.head_first.sol.structural.bridge;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.structural.bridge.classes.ConcreteRemote;
import com.example.gofp.head_first.sol.structural.bridge.classes.RCARemote;
import com.example.gofp.head_first.sol.structural.bridge.classes.RemoteControl;
import com.example.gofp.head_first.sol.structural.bridge.classes.SonyRemote;

public class Bridge extends BasePattern {

    public void main() {
        RemoteControl remoteRCA = new ConcreteRemote(new RCARemote());
        RemoteControl remoteSony = new ConcreteRemote(new SonyRemote());

        remoteRCA.on();
        remoteRCA.nextChannel();
        remoteRCA.previousChannel();
        remoteRCA.off();
        Systems.out.println();

        remoteSony.on();
        remoteSony.nextChannel();
        remoteSony.nextChannel();
        remoteSony.off();
    }
}
