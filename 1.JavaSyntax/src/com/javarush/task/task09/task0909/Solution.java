package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
*/

public class Solution {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;//напишите тут ваш код
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Элемент массива не существует!");
        }//напишите тут ваш код
    }
}
