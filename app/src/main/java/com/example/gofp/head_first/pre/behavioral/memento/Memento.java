package com.example.gofp.head_first.pre.behavioral.memento;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.pre.behavioral.memento.classes.GameState;
import com.example.gofp.head_first.pre.behavioral.memento.classes.MasterGameObject;

public class Memento extends BasePattern {
    @Override
    public void main() {
        MasterGameObject mgo = new MasterGameObject("Mike");

        GameState savedState = mgo.getCurrentState();       // 0
        Systems.out.println(mgo);
        Systems.out.println();

        mgo.setLevel(2);
        GameState savedState1 = mgo.getCurrentState();        // 1
        Systems.out.println(mgo);
        Systems.out.println();


        mgo.setPlayer("Jimmy");
        mgo.setLevel(3);
        Systems.out.println(mgo);
        Systems.out.println();

        mgo.restoreState(savedState);
        Systems.out.println(mgo);
        Systems.out.println();

        mgo.restoreState(savedState1);    // 1
        Systems.out.println(mgo);
        Systems.out.println();

        Systems.out.println("States encapsulation:");
        Systems.out.println(savedState.getPlayer() + " " + savedState.getLevel());
        Systems.out.println(savedState.toString().replaceAll(".*\\.", ""));

    }
}
