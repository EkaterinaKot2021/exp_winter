package com.exlab;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{7, 4, 9, 1, 5};


        boolean isSorted = false;
        int temp = 0;
         while (!isSorted) {
            isSorted = true;

            for(int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    isSorted = false;


                }
            }

            }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }

        }
    }
