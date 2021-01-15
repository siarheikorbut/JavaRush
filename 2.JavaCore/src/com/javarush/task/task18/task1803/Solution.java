package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Integer> array = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            array.add(data);
        }
        inputStream.close();

        Map<Integer, Integer> repeats = new HashMap<>();
        for (int temp1 : array) {
            int count = 0;
            for (int temp2 : array) {
                if (temp1 == temp2) {
                    count++;
                }
                repeats.put(temp1, count);
            }
        }

        Integer max = Collections.max(repeats.values());
        for (Map.Entry<Integer, Integer> repeat : repeats.entrySet()) {
            if (repeat.getValue().equals(max)) {
                System.out.print(repeat.getKey() + " ");
            }
        }
    }
}