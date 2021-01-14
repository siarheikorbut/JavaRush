package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName_1;
        String fileName_2;
        try {
            fileName_1 = reader.readLine();
            fileName_2 = reader.readLine();
            reader.close();
            String input;
            BufferedReader fileReader_1 = new BufferedReader(new FileReader(fileName_1));
            while ((input = fileReader_1.readLine()) != null) {
                allLines.add(input);
            }
            fileReader_1.close();
            BufferedReader fileReader_2 = new BufferedReader(new FileReader(fileName_2));
            while ((input = fileReader_2.readLine()) != null) {
                forRemoveLines.add(input);
            }
            fileReader_2.close();
            new Solution().joinData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}