package com.javarush.task.task04.task0427;

import java.io.*;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        boolean n1 = a < 10 && a > 0; //однозначное
        boolean n2 = a < 100 && a >= 10; //двухзначное
        boolean n3 = a < 1000 && a >= 100; //трёхзначное

        boolean x1 = (a % 2) == 0; //четное
        boolean x2 = true; //нечетное

        boolean y = a > 0 && a < 1000; //ограничения

        if (y && x1 && n1) {
            System.out.println("четное однозначное число");
        } else if (y && n1) {
            System.out.println("нечетное однозначное число");
        } else if (y && x1 && n2) {
            System.out.println("четное двузначное число");
        } else if (y && n2) {
            System.out.println("нечетное двузначное число");
        } else if (y && x1) {
            System.out.println("четное трехзначное число");
        } else if (y) {
            System.out.println("нечетное трехзначное число");
        }// напишите тут ваш код
    }
}
