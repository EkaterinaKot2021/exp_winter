package com.exlab.sportgames;

public class TeamGame {
    private String name;
    public String getName(){ return name; }

    public TeamGame(String name){

        this.name=name;
    }

    public void display(){

        System.out.println("Name: " + name);
    }
}
