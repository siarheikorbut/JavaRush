package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));

        List<Integer> list = new ArrayList<>();

        try {
            int i;
            while ((i = Integer.parseInt(bufferedReader.readLine())) != -1) {
                if (i % 2 == 0) {
                    list.add(i);
                }
            }
        } catch (NumberFormatException e) {
            e.getStackTrace();
        }

        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        reader.close();
        bufferedReader.close();
    }// напишите тут ваш код
}