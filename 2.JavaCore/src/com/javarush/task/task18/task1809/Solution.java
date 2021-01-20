package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);

        List<Integer> tempDataArray = new ArrayList<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            tempDataArray.add(data);
        }
        Collections.reverse(tempDataArray);

        for (Integer tempData : tempDataArray) {
            outputStream.write(tempData);
        }
        inputStream.close();
        outputStream.close();
    }
}
