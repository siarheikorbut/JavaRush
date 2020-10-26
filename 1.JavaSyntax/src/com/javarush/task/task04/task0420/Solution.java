package com.javarush.task.task04.task0420;                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
/*                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
Сортировка трех чисел                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a >= b && a >= c && b >= c) {
            System.out.print(a + " " + b + " " + c);
        } else if (a >= c && c >= b) {
            System.out.print(a + " " + c + " " + b);
        } else if (b >= c && c >= a) {
            System.out.print(b + " " + c + " " + a);
        } else if (b >= a && b >= c) {
            System.out.print(b + " " + a + " " + c);
        } else if (a >= b) {
            System.out.print(c + " " + a + " " + b);
        } else {
            System.out.print(c + " " + b + " " + a);
        }//напишите тут ваш код
    }
}