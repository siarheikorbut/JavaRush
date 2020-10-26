package com.javarush.task.task04.task0432;

import java.io.*;
                                                                                                                                                      
/*                                                                                                                                                       
Хорошего много не бывает                                                                                                                                                      
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int n = Integer.parseInt(s2);

        while (n >= 1) {
            System.out.println(s1);
            n--;
        }//напишите тут ваш код
    }
}