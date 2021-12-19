package com.exlab.sportgames;

public class TableTennis {
    private String name = "Rugby";
    private int numberOfPlayers = 2;
    private String moto = "TableTennis is the best";

    public TableTennis(){

    }
    public TableTennis(String name){
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
