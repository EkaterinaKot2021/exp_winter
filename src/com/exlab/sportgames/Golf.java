package com.exlab.sportgames;

public class Golf extends SingleGame {
    private String name = "Golf";
    private int numberOfPlayers = 1;
    private String moto = "Golf is the best";

    public Golf() {

    }

    public Golf(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;

    }

    public void setNumberOfPlayers(int numberOfPlayersValue) {
        this.numberOfPlayers = numberOfPlayersValue;
    }

    public int getNumberOfPlayers() {
        return this.numberOfPlayers;

    }

    public void setMoto(String motoValue) {
        this.moto = motoValue;
    }

    public String getMoto() {
        return this.moto;

    }


    }

