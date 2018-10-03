package com.lena.homework.ex4;

public class FactorialNumSum {
    public static void main(String[] args) {
        FactorialOfNumSum(7);
    }

    public static void FactorialOfNumSum(int num) {
        int sum = 1;
        for (int i=1; i<=num; i++){
            sum*=i;
        }
        System.out.println("Факториал числа - " + num + ", равен " + sum);
    }

}
