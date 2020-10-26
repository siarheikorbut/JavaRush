package com.javarush.task.task05.task0532;

import java.io.*;
                                                                                                                                                      
/*                                                                                                                                                       
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция                                                                                                                                                      
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int max = 0;
        int i = 0;
        if (n > 0) {
            while (true) {
                int num = Integer.parseInt(reader.readLine());
                if (i == 0) {
                    max = num;
                }
                if (num > max) {
                    max = num;
                }
                i++;
                if (i == n) {
                    System.out.print(max);
                }
            }
        }
    }
}