package com.lena.homework.ex4;

import java.util.Random;

public class RandomMax {
    public static void main(String[] args) {
        int [] number = new int[10];
        Random rand = new Random();
        int max=0;

        for (int i=0; i<number.length; i++){
            number[i]=rand.nextInt(100);

            System.out.print(number[i] + ", ");

            if (number[i]>max){
                max=number[i];

            }
        }
        System.out.println();
        System.out.println("max is: " + max);
    }
}
