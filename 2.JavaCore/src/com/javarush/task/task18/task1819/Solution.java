package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        List<Integer> tempArray = new ArrayList<>();

        try (FileInputStream inputStream1 = new FileInputStream(fileName1);
             FileInputStream inputStream2 = new FileInputStream(fileName2);
             FileOutputStream outputStream = new FileOutputStream(fileName1)) {
            while (inputStream2.available() > 0) {
                int data = inputStream2.read();
                tempArray.add(data);
            }
            while (inputStream1.available() > 0) {
                int data = inputStream1.read();
                tempArray.add(data);
            }
            for (Integer integer : tempArray) {
                outputStream.write(integer);
            }
        }
    }
}