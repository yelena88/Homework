package com.lena.hometests;

import java.util.Arrays;

public class Testy4 {
    public static void main(String[] args) {
        int [] numbers = {3, 2, 1};
        System.out.println(Arrays.binarySearch(numbers,2));
        System.out.println(Arrays.binarySearch(numbers, 3));

    }
}
