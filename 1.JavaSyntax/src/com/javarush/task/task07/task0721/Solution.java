package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] arr;
        arr = getInts();

        int maximum = arr[0];
        int minimum = arr[0];

        for (int j : arr) {
            if (j > maximum) {
                maximum = j;
            }
        }
        for (int j : arr) {
            if (j < minimum) {
                minimum = j;
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;//напишите тут ваш код
    }
}
