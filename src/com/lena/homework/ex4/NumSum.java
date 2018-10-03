package com.lena.homework.ex4;

public class NumSum {
    public static void main(String[] args) {
        sumOfNum(7);
    }

    public static void sumOfNum(int num) {
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел числа - " + num + ", равна " + sum);
    }
}
