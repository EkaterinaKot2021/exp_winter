package com.exlab;

import com.exlab.sportgames.*;

public class Executor {

    public static void main(String[] args) {
        Basketball basketball = new Basketball();
        Football football = new Football();
        Rugby rugby = new Rugby();
        Billiards billiards = new Billiards();
        TableTennis tableTennis = new TableTennis();
        Golf golf = new Golf();



        System.out.println(basketball.getNumberOfPlayers());
        System.out.println(basketball.getMoto());
        System.out.println(basketball.getType());
        System.out.println(basketball.getName());
        System.out.println(basketball.getCategory());

    }

        }
//        Game tennis = new Game();
//        Game football = new Game();


//        System.out.println(tennis.getteamNum());
//        System.out.println(tennis.getcountry());

//        tennis.setteamNum(4);
//        tennis.setcountry("England");

//        System.out.println(tennis.getteamNum());
//        System.out.println(tennis.getcountry());



