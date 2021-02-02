package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;

/*
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader(args[0])) {
            int count = 0;
            while (fileReader.ready()) {
                char readChar = (char) fileReader.read();
                String s = "" + readChar;
                if (s.matches("[a-zA-Z]")) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}