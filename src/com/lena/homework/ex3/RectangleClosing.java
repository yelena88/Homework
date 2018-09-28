package com.lena.homework.ex3;

public class RectangleClosing {
    public static void main(String[] args) {
        willCover (5, 7, 5);
    }

    public static void willCover(int a, int b, int rad) {
        if (rad*rad >= ((a*a)+(b*b))/4) {
            System.out.print("т.к. " + rad*rad + " >= " +  ((a*a)+(b*b))/4 + " , ");
            System.out.println("то прямоугольное отверстие закроется круглой картонкой");
        } else {
            System.out.print("т.к. " + rad*rad + " < " +  ((a*a)+(b*b))/4 + " , ");
            System.out.println("прямоугольное отверстие не закроется круглой картонкой");
        }
    }
}
