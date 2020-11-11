package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<>();
        int count;
        for (String string : strings) {
            count = string.length();
            if (count % 2 == 0) {
                resultStrings.add(string + " " + string);
            } else {
                resultStrings.add(string + " " + string + " " + string);
            }
        }

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }
}