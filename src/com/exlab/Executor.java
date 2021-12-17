package com.exlab;

public class Executor {

    public static void main(String[] args) {

        Game tennis = new Game();
        Game football = new Game();


        System.out.println(tennis.getteamNum());
        System.out.println(tennis.getcountry());

        tennis.setteamNum(4);
        tennis.setcountry("England");

        System.out.println(tennis.getteamNum());
        System.out.println(tennis.getcountry());



    }
}