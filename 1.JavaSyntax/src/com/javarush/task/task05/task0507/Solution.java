package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int count = 0;

        while (true) {
            int s = Integer.parseInt(reader.readLine());
            if (s != -1) {
                sum = sum + s;
                count++;
            }
            if (s == -1) {
                break;
            }//напишите тут ваш код
        }
        System.out.println(sum / count);
    }
}
