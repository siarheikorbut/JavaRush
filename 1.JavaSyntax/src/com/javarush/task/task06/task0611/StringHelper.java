package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        StringBuilder result = new StringBuilder();
        for (int a = 0; a < 5; a++)
            result.append(s);//напишите тут ваш код
        return result.toString();
    }

    public static String multiply(String s, int count) {
        StringBuilder result = new StringBuilder();
        for (int b = 0; b < count; b++)
            result.append(s);//напишите тут ваш код
        return result.toString();
    }

    public static void main(String[] args) {
    }
}
