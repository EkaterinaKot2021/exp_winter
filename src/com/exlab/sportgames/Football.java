package com.exlab.sportgames;

import com.exlab.stadium.IChampionate;

public class Football extends TeamGame implements IChampionate {
    private String name = "default";
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
    public void printInfo() {
        System.out.println("=====");
        System.out.println("Name: " + this.name);
        System.out.println("NumberOfPlayers: " + this.numberOfPlayers);
        System.out.println("Moto: " + this.moto);
        System.out.println("Type: " + getType());
        System.out.println("Category: " + getCategory());
        System.out.println("=====");
    }

    @Override
    public String printInfoChampionate() {
        return this.name;
    }

    @Override
    public void winning() {
        System.out.println("2games");

    }
    public void winning(String manyGames) {
        System.out.println(manyGames);
    }
}
