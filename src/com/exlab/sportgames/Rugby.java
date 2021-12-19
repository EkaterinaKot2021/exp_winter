package com.exlab.sportgames;

public class Rugby {
    private String name = "Rugby";
    private int numberOfPlayers = 15;
    private String moto = "Rugby is the best";

    public Rugby(){

    }
    public Rugby(String name){
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
