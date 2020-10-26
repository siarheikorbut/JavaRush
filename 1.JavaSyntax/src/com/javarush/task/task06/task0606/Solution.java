package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        for (int length = s.length() - 1; length >= 0; length--) {
            int i = Integer.parseInt(Integer.toString(s.charAt(length)));
            int a = i % 2 == 0 ? even++ : odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);//напишите тут ваш код
    }
}