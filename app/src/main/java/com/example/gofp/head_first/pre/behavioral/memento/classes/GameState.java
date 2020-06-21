package com.example.gofp.head_first.pre.behavioral.memento.classes;

public class GameState {

    private final String player;
    private final int level;

    public GameState(String player, int level) {
        this.player = player;
        this.level = level;
    }

    public String getPlayer() {
        return player;
    }

    public int getLevel() {
        return level;
    }

}
