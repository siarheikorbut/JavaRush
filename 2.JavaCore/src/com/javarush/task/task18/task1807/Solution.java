package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        List<Integer> byteArray = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            byteArray.add(data);
        }
        inputStream.close();

        System.out.println(Collections.frequency(byteArray, (int) ','));
    }
}