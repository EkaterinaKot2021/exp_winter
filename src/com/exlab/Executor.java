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

//        Golf golf1 = new Golf("Golf111");
//        golf1 setCategory("Junior");
//        golf1 setMoto("Golf is super");
//        golf1 setNumberOfPlayers(10);
//        golf1 printInfo();

        Rugby rugby1 = new Rugby("R1");
        String name = rugby1.getName();
        System.out.println(name);


        System.out.println(basketball.getNumberOfPlayers());
        System.out.println(basketball.getMoto());
        System.out.println(basketball.getType());
        System.out.println(basketball.getName());

        Athlete ivan = new Athlete();
        Referee pavel = new Referee();

        ivan.eat();
        ivan.sleep();
        ivan.speak();
        pavel.eat();
        pavel.sleep();
        pavel.speak();






    }
//    public void printInfo() {
//        System.out.println("=====");
//        System.out.println("Name: " + this.name);
//        System.out.println("NumberOfPlayers: " + this.numberOfPlayers);
//        System.out.println("Moto: " + this.moto);
//       System.out.println("Type: " + getType());
//       System.out.println("Category: " + getCategory());
//        System.out.println("=====");
    }



//        Game tennis = new Game();
//        Game football = new Game();


//        System.out.println(tennis.getteamNum());
//        System.out.println(tennis.getcountry());

//        tennis.setteamNum(4);
//        tennis.setcountry("England");

//        System.out.println(tennis.getteamNum());
//        System.out.println(tennis.getcountry());



