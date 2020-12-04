package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        reader.close();

        InputStream fileInputStream = new FileInputStream(filePath);
        char[] fileChars = new char[fileInputStream.available()];

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileInputStream));
        fileReader.read(fileChars);
        fileInputStream.close();

        StringBuilder outputString = new StringBuilder();
        for (char fileChar : fileChars) {
            outputString.append(fileChar);
        }
        System.out.println(outputString);
    }
}