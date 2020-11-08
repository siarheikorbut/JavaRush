package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Смирнов", "Иван");
        map.put("Иванов", "Владимир");
        map.put("Петров", "Валентин");
        map.put("Сидоров", "Артур");
        map.put("Козлов", "Сергей");
        map.put("Карпов", "Иван");
        map.put("Цветков", "Андрей");
        map.put("Горшков", "Александр");
        map.put("Стулов", "Владимир");
        map.put("Шкафов", "Петр");
        return map;//напишите тут ваш код
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        List <String> array = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (set.add(value)){
                set.add(value);
            } else array.add(value);
        }
        for (String value: array) {
            removeItemFromMapByValue(map,value);
        }//напишите тут ваш код
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}