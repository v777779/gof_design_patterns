package com.example.gofp.head_first.pre.behavioral.memento.classes;

import androidx.annotation.NonNull;

public class MasterGameObject {
    private String player;
    private int level;

    public MasterGameObject(String player) {
        this.player = player;
        this.level =  1;
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

    public  GameState getCurrentState(){
        return new GameState(player,level);
    }

    public void restoreState(GameState savedState){
        this.player = savedState.getPlayer();
        this.level = savedState.getLevel();
    }


    @NonNull
    @Override
    public String toString() {
        return "Game:"
                + " player: " + player
                + " level: " + level;
    }
}
