package com.exlab.sportgames;

public class Football extends TeamGame {
    private String name = "Football";
    private int numberOfPlayers = 11;
    private String moto = "Football is the best";

    public Football(){

    }
    public Football(String name){
        this.name = name;
    }
    public String getName(){
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
