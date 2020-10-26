package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[10];

        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
        }

        int[] num = new int[10];

        for (int i = 0; i < str.length; i++) {
            num[i] = str[i].length();
        }
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        System.out.println(num[6]);
        System.out.println(num[7]);
        System.out.println(num[8]);
        System.out.println(num[9]);//напишите тут ваш код
    }
}
