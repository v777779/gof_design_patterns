package com.example.gofp.head_first.sol.behavioral.memento;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.memento.classes.GameCareTaker;
import com.example.gofp.head_first.sol.behavioral.memento.classes.MasterGameObject;

public class Memento extends BasePattern {
    @Override
    public void main() {
        MasterGameObject game = new MasterGameObject("Mike");
        GameCareTaker careTaker = new GameCareTaker();

        MasterGameObject.Memento savedState = game.getCurrentState();
        careTaker.saveState(savedState); // 0
        Systems.out.println(game);
        Systems.out.println();

        game.setLevel(2);
        savedState = game.getCurrentState();
        careTaker.saveState(savedState);  // 1
        Systems.out.println(game);
        Systems.out.println();


        game.setPlayer("Jimmy");
        game.setLevel(3);
        Systems.out.println(game); // 2
        Systems.out.println();

        savedState = careTaker.readState(0);
        game.restoreState(savedState); // 0
        Systems.out.println(game);
        Systems.out.println();

        savedState = careTaker.readState(1);
        game.restoreState(savedState); // 1
        Systems.out.println(game);
        Systems.out.println();

        Systems.out.println("States encapsulation:");
        savedState = careTaker.readState(0);
//        Systems.out.println(savedState.getPlayer()+" "+savedState.getLevel());
        Systems.out.println(savedState.toString().replaceAll(".*\\.", ""));

    }
}
