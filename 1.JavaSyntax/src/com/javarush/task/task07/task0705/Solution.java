package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bigArray = new int[20];
        for (int i = 0; i < bigArray.length; i++) {
            String s = reader.readLine();
            bigArray[i] = Integer.parseInt(s);
        }

        int[] littleArray1 = new int[10];
        System.arraycopy(bigArray, 0, littleArray1, 0, 10);

        int[] littleArray2 = new int[10];
        System.arraycopy(bigArray, 10, littleArray2, 0, 10);

        System.out.println(littleArray2[0]);
        System.out.println(littleArray2[1]);
        System.out.println(littleArray2[2]);
        System.out.println(littleArray2[3]);
        System.out.println(littleArray2[4]);
        System.out.println(littleArray2[5]);
        System.out.println(littleArray2[6]);
        System.out.println(littleArray2[7]);
        System.out.println(littleArray2[8]);
        System.out.println(littleArray2[9]);//напишите тут ваш код;
    }
}
