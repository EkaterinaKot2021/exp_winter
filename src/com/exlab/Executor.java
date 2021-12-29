package com.exlab;

import com.exlab.human.Athlete;
import com.exlab.human.Referee;
import com.exlab.sportgames.*;
import com.exlab.stadium.Stadium;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    public static void main(String[] args) {
        Basketball basketball = new Basketball();
        Football football = new Football();
        Rugby rugby = new Rugby();
        Billiards billiards = new Billiards();
        TableTennis tableTennis = new TableTennis();
        Golf golf = new Golf();

        Golf golf1 = new Golf("Golf111");
        golf1.setCategory("Junior");
        golf1.setMoto("Golf is super");
        golf1.setNumberOfPlayers(10);
        golf1.printInfo();

        Rugby rugby1 = new Rugby("R1");
        String name = rugby1.getName();
        System.out.println(name);


        System.out.println(basketball.getNumberOfPlayers());
        System.out.println(basketball.getMoto());
        System.out.println(basketball.getType());
        System.out.println(basketball.getName());

        System.out.println("================");

        Athlete ivan = new Athlete();
        Referee pavel = new Referee();

        ivan.eat();
        ivan.sleep();
        ivan.speak();
        pavel.eat();
        pavel.sleep();
        pavel.speak();

        System.out.println("================");


        Stadium stadium1 = new Stadium("Arena");
        System.out.println(stadium1.getName());

        stadium1.setGame(basketball);
        System.out.println("basketball");

        stadium1.setGame(billiards);
        System.out.println("billiards");

        stadium1.setGame(football);
        System.out.println("football");

        stadium1.setGame(rugby);
        System.out.println("rugby");

        stadium1.setGame(tableTennis);
        System.out.println("tableTennis");

        System.out.println("================");



        Football football1 = new Football("Spartak");
		football1.printInfo();
		football1.winning();
		football1.winning("5games");

        System.out.println("================");

        List<String> listStr = new ArrayList<String>();
        listStr.add("basketball");
        listStr.add("football");
        listStr.add("rugby");
        listStr.add("golf");
        listStr.add("billiards");
        listStr.add("tableTennis");

        for(String str1 : listStr) {
            System.out.println(str1);
        }





    }
    }
//    public void printInfo() {
//        System.out.println("=====");
//        System.out.println("Name: " + this.name);
//        System.out.println("NumberOfPlayers: " + this.numberOfPlayers);
//        System.out.println("Moto: " + this.moto);
//       System.out.println("Type: " + getType());
//       System.out.println("Category: " + getCategory());
//        System.out.println("=====");




//        Game tennis = new Game();
//        Game football = new Game();


//        System.out.println(tennis.getteamNum());
//        System.out.println(tennis.getcountry());

//        tennis.setteamNum(4);
//        tennis.setcountry("England");

//        System.out.println(tennis.getteamNum());
//        System.out.println(tennis.getcountry());



