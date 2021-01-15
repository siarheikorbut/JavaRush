package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        List<Integer> array = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(s);

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            array.add(data);
        }
        inputStream.close();

        Collections.sort(array);
        System.out.println(array.get(array.size() - 1));
    }
}