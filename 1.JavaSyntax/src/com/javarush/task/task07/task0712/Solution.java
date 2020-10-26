package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> listStr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listStr.add(reader.readLine());
        }
        ArrayList<Integer> listStrLength = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listStrLength.add(listStr.get(i).length());
        }
        int indexMin = listStrLength.indexOf(Collections.min(listStrLength));
        int indexMax = listStrLength.indexOf(Collections.max(listStrLength));
        if (indexMin < indexMax) {
            System.out.println(listStr.get(indexMin));
        } else {
            System.out.println(listStr.get(indexMax));
        }
    }
}