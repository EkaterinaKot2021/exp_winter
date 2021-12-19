package com.exlab.sportgames;

public class Billiards extends SingleGame {
    private String name = "Billiards";
    private int numberOfPlayers = 1;
    private String moto = "Billiards is the best";

    public Billiards(){

    }
    public Billiards(String name){
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
