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

    public void printInfo() {
        System.out.println("=====");
        System.out.println("Name: " + this.name);
        System.out.println("NumberOfPlayers: " + this.numberOfPlayers);
        System.out.println("Moto: " + this.moto);
        System.out.println("Type: " + getType());
        System.out.println("Category: " + getCategory());
        System.out.println("=====");

    }
}
