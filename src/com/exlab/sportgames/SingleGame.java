package com.exlab.sportgames;

public class SingleGame {
    private String name;
    public String getName(){ return name; }

    public SingleGame(String name){

        this.name=name;
    }

    public void display(){

        System.out.println("Name: " + name);
    }
}

