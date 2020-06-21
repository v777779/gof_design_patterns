package com.example.gofp.head_first.sol.behavioral.memento.classes;

import androidx.annotation.NonNull;

public class MasterGameObject {
    private String player;
    private int level;

    public MasterGameObject(String player) {
        this.player = player;
        this.level = 1;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

// memory

    public Memento getCurrentState() {
        return new Memento(player, level);
    }

    public void restoreState(Memento memento) {
        this.player = memento.player;
        this.level = memento.level;
    }

// classes

    public static class Memento {
        private final String player;
        private final int level;

        public Memento(String player, int level) {
            this.player = player;
            this.level = level;
        }
    }

    @NonNull
    @Override
    public String toString() {
        return "Game:"
                + " player: " + player
                + " level: " + level;
    }
}
