package com.lena.homework.ex4;

public class NumSumBefore {
    public static void main(String[] args) {
        SumBeforeNum(36);
    }

    public static void SumBeforeNum(int num) {
        int sum = 0;

        for (int i = 0; i<num; i++){
            sum += i;
        }
        System.out.println("Сумма всех чисел числа - " + num + ", равна " + sum);
    }
}
