package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Иванов", "Кирилл");
        map.put("Иванов", "Алексей");
        map.put("Иванов", "Сергей");
        map.put("Иванов", "Петр");
        map.put("Сидоров", "Иван");
        map.put("Петров", "Иван");
        map.put("Говнов", "Иван");
        map.put("Урюков", "Иван");
        map.put("Козлов", "Иван");
        return map;//напишите тут ваш код
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}