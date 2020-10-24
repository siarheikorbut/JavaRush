package com.javarush.task.task03.task0314;                                                  
                                                  
/*                                                   
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция                                                  
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("     Таблица умножения");
        int[][] multiplicationTable = new int[10][10];
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.printf("%-3d", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}