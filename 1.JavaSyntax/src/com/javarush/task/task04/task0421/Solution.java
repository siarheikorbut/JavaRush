package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int len1 = s1.length();
        int len2 = s2.length();

        if (s1.equals(s2)) {
            System.out.println("Имена идентичны");
        } else if (len1 == len2) {
            System.out.println("Длины имен равны");
        }//напишите тут ваш код
    }
}
