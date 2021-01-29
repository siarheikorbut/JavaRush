package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader(args[0])) {
            int countOfCharacters = 0;
            int countOfSpaces = 0;
            while (fileReader.ready()) {
                countOfCharacters++;
                char readChar = (char) fileReader.read();
                String s = "" + readChar;
                if (s.matches("[\\s]")) {
                    countOfSpaces++;
                }
            }
            System.out.println((double) Math.round((double) countOfSpaces / countOfCharacters * 10000) / 100);
        }
    }
}