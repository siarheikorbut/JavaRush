package com.javarush.task.task04.task0413;                                                                                                    
                                                                                                    
/*                                                                                                     
День недели                                                                                                    
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();

        int a = Integer.parseInt(num);

        if (a <= 0 || a > 7) {
            System.out.println("такого дня недели не существует");
        } else if (a == 1) {
            System.out.println("понедельник");
        } else if (a == 2) {
            System.out.println("вторник");
        } else if (a == 3) {
            System.out.println("среда");
        } else if (a == 4) {
            System.out.println("четверг");
        } else if (a == 5) {
            System.out.println("пятница");
        } else if (a == 6) {
            System.out.println("суббота");
        } else {
            System.out.println("воскресенье");
        }//напишите тут ваш код
    }
}