package com.example.gofp.head_first.sol.behavioral.memento.classes;

import java.util.ArrayList;
import java.util.List;

public class GameCareTaker {
    private List<MasterGameObject.Memento> mementos
            ;

    public GameCareTaker() {
        this.mementos = new ArrayList<>();
    }

    public void saveState(MasterGameObject.Memento state) {
        mementos.add(state);
    }

    public MasterGameObject.Memento readState(int index) {
        return mementos.get(index);
    }


}
