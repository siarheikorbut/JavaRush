package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] list = string.toCharArray();
        list[0] = Character.toUpperCase(list[0]);
        for (int i = 1; i < list.length; i++) {
            if (list[i - 1] == 32) {
                list[i] = Character.toUpperCase(list[i]);
            }
        }
        string = String.valueOf(list);
        System.out.println(string); //напишите тут ваш код
    }
}