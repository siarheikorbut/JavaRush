package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (FileOutputStream outputStream = new FileOutputStream(reader.readLine(), true);
             FileInputStream inputStream1 = new FileInputStream(reader.readLine());
             FileInputStream inputStream2 = new FileInputStream(reader.readLine())) {
            while (inputStream1.available() > 0) {
                int data = inputStream1.read();
                outputStream.write(data);
            }
            while (inputStream2.available() > 0) {
                int data = inputStream2.read();
                outputStream.write(data);
            }
        }
    }
}