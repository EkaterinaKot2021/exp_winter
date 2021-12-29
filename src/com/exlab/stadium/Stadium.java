package com.exlab.stadium;

public class Stadium implements IChampionship{
    private IChampionship game;
    private String name;

    public Stadium() {

    }

    public Stadium(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setGame(IChampionship game) {
        this.game = game;
    }

    public IChampionship getGame() {
        return this.game;
    }


    @Override
    public String printInfoChampionship() {
        return this.name;
    }
}
