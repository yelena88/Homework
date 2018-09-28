package com.lena.homework.ex2;

public class Number{
    public static void main(String[] args) {
        isSeven(3907);
        isSeven(4544);
    }

    public static void isSeven(int num) {
        if (num % 10 == 7 || num % 10 == -7){
            System.out.println("Последняя цифра созданного числа - " + num +  ", является 7-ой");
        } else {
            System.out.println("Последняя цифра созданного числа - " + num +  ", не является 7-ой");
        }
    }
}

