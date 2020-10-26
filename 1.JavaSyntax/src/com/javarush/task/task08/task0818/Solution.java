package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> surnamesAndSalary = new HashMap<>();
        surnamesAndSalary.put("Иванов", 550);
        surnamesAndSalary.put("Петров", 880);
        surnamesAndSalary.put("Сидоров", 940);
        surnamesAndSalary.put("Фрадков", 430);
        surnamesAndSalary.put("Козлов", 350);
        surnamesAndSalary.put("Говнов", 500);
        surnamesAndSalary.put("Ухов", 640);
        surnamesAndSalary.put("Карпов", 1000);
        surnamesAndSalary.put("Жданов", 3000);
        surnamesAndSalary.put("Уродов", 120);
        return surnamesAndSalary;//напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        map.values().removeIf(Integer -> Integer < 500);//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}