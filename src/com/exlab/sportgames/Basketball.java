package com.exlab.sportgames;

public class Basketball extends TeamGame {
    private String name = "Basketball";
    private int numberOfPlayers = 5;
    private String moto = "Basketball is the best";

    public Basketball(){

  }
    public Basketball(String name){
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
