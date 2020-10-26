package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);// Найти минимум тут
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(reader.readLine()); i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }
        return array;// Создать и заполнить список тут
    }
}