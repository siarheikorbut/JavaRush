package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> citizen = new HashMap<>();
        citizen.put("Иванов", "Иван");
        citizen.put("Петров", "Петр");
        citizen.put("Сидоров", "Василий");
        citizen.put("Козлов", "Алексей");
        citizen.put("Блинов", "Андрей");
        citizen.put("Говнов", "Евгений");
        citizen.put("Карпов", "Максим");
        citizen.put("Рыбаков", "Александр");
        citizen.put("Дрочев", "Глеб");
        citizen.put("Херов", "Владимир");
        return citizen;//напишите тут ваш код
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (value.equals(name)) {
                count++;
            }
        }
        return count;
    }//напишите тут ваш код

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key.equals(lastName)) {
                count++;//напишите тут ваш код
            }
        }
        return count;
    }//напишите тут ваш код

    public static void main(String[] args) {
    }
}
