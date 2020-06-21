package com.example.gofp.head_first.sol.behavioral.command.classes;

import androidx.annotation.NonNull;

public class SimpleRemote {
    private static final int SLOT_NUMBER = 7;
    private Command[] onCommands;
    private Command[] offCommands;

    public SimpleRemote() {
        Command noCommand = new NoCommand();
        onCommands = new Command[SLOT_NUMBER];
        offCommands = new Command[SLOT_NUMBER];
        for (int i = 0; i < SLOT_NUMBER; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void onButtonPressed(int slot) {
        if (slot < 0 || slot >= SLOT_NUMBER) {
            return;
        }
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        if (slot < 0 || slot >= SLOT_NUMBER) {
            return;
        }
        offCommands[slot].execute();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot < 0 || slot >= SLOT_NUMBER) {
            return;
        }
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SLOT_NUMBER; i++) {
            sb.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append(" ").append(offCommands[i].getClass().getSimpleName())
                    .append(String.format("%n"));
        }
        return sb.toString();
    }
}
