package com.javarush.task.task04.task0441;

import java.io.*;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
/*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
Как-то средненько                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a <= b && b <= c) {
            System.out.println(b);
        } else if (c <= b && b <= a) {
            System.out.println(b);
        } else if (b <= a && a <= c) {
            System.out.println(a);
        } else if (c <= a && a <= b) {
            System.out.println(a);
        } else if (a <= c) {
            System.out.println(c);
        } else {
            System.out.println(c);
        }//напишите тут ваш код
    }
}