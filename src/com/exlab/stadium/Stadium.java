package com.exlab.stadium;

public class Stadium {
    private IChampionate game;
    private String name;

    public Stadium() {

    }

    public Stadium(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setGame(IChampionate game) {
        this.game = game;
    }

    public IChampionate getGame() {
        return this.game;
    }



}
