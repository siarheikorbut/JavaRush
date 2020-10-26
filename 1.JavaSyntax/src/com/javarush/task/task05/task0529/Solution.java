package com.javarush.task.task05.task0529;

import java.io.*;
                                                                                                                                                                                                        
/*                                                                                                                                                                                                         
Консоль-копилка                                                                                                                                                                                                        
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true) {

            String s = buffer.readLine();
            if (s.equals("сумма")) {
                break;
            } else {
                int n = Integer.parseInt(s);
                sum += n;
            }
        }
        System.out.println(sum);//напишите тут ваш код
    }
}