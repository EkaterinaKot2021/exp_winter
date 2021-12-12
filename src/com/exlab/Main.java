package com.exlab;

public class Main {

    public static void main(String[] args) {
        int index = 0;

        for (int i = 0; i < 10000; i++)
            if ((i % 7 == 0) & i != 0) {
                index ++;
                System.out.println( index + " Yes! " + i);
            }
        }}