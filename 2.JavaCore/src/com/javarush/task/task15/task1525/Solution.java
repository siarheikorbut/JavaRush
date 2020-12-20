package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.javarush.task.task15.task1525.Statics.FILE_NAME;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME)));
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}