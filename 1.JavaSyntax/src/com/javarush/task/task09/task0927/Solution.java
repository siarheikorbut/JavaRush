package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("A", new Cat("Васька"));
        map.put("B", new Cat("Барсик"));
        map.put("C", new Cat("Зверь"));
        map.put("D", new Cat("Петруха"));
        map.put("E", new Cat("Малёк"));
        map.put("F", new Cat("Крутой"));
        map.put("G", new Cat("Иван"));
        map.put("H", new Cat("Мур-мяу"));
        map.put("I", new Cat("Витёк"));
        map.put("J", new Cat("Ласа"));

        return map;//напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
