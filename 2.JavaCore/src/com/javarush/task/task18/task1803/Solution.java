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

        List<Integer> byteArray = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            byteArray.add(data);
        }
        inputStream.close();

        Map<Integer, Integer> byteRepeats = new HashMap<>();
        for (int byteTemp1 : byteArray) {
            int count = 0;
            for (int byteTemp2 : byteArray) {
                if (byteTemp1 == byteTemp2) {
                    count++;
                }
                byteRepeats.put(byteTemp1, count);
            }
        }

        Integer max = Collections.max(byteRepeats.values());
        for (Map.Entry<Integer, Integer> byteRepeat : byteRepeats.entrySet()) {
            if (byteRepeat.getValue().equals(max)) {
                System.out.print(byteRepeat.getKey() + " ");
            }
        }
    }
}