package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[10];

        for (int i = 0; i < list.length - 2; i++) {
            list[i] = reader.readLine();
        }
        System.out.println(list[9]);
        System.out.println(list[8]);
        System.out.println(list[7]);
        System.out.println(list[6]);
        System.out.println(list[5]);
        System.out.println(list[4]);
        System.out.println(list[3]);
        System.out.println(list[2]);
        System.out.println(list[1]);
        System.out.println(list[0]);//напишите тут ваш код
    }
}