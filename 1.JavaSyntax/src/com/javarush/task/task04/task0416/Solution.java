package com.javarush.task.task04.task0416;                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
/*                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
Переходим дорогу вслепую                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double in = Double.parseDouble(reader.readLine());

        in = in * 1.0;
        if (in % 5 < 3.0) {
            System.out.println("зелёный");
        } else if (in % 5 >= 3.0 && in % 5 < 4.0) {
            System.out.println("жёлтый");
        } else if (in % 5 >= 4.0 && in % 5 < 5.0) {
            System.out.println("красный");
        }//напишите тут ваш код
    }
}