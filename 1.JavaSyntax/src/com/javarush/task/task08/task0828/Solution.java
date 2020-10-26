package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> monthsOfTheYear = new HashMap<>();
        monthsOfTheYear.put("January", 1);
        monthsOfTheYear.put("February", 2);
        monthsOfTheYear.put("March", 3);
        monthsOfTheYear.put("April", 4);
        monthsOfTheYear.put("May", 5);
        monthsOfTheYear.put("June", 6);
        monthsOfTheYear.put("July", 7);
        monthsOfTheYear.put("August", 8);
        monthsOfTheYear.put("September", 9);
        monthsOfTheYear.put("October", 10);
        monthsOfTheYear.put("November", 11);
        monthsOfTheYear.put("December", 12);

        String month = reader.readLine();

        for (Map.Entry<String, Integer> pair : monthsOfTheYear.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (month.equals(key)) {
                System.out.println(month + " is the " + value + " month");//напишите тут ваш код
            }
        }
    }
}
