package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Андрей", true, 5);
        Human child2 = new Human("Алёна", false, 8);
        Human child3 = new Human("Никита", true, 3);

        Human father = new Human("Сергей", true, 32, child1, child2, child3);
        Human mother = new Human("Екатерина", false, 30, child1, child2, child3);

        Human granddad1 = new Human("Иван", true, 65, father);
        Human granddad2 = new Human("Валерий", true, 64, mother);

        Human granny1 = new Human("Елена", false, 60, father);
        Human granny2 = new Human("Ксения", false, 57, mother);

        List<Human> family = new ArrayList<>();
        family.add(child1);
        family.add(child2);
        family.add(child3);
        family.add(father);
        family.add(mother);
        family.add(granddad1);
        family.add(granny1);
        family.add(granddad2);
        family.add(granny2);

        for (Human human : family) {
            System.out.println(human);
        }//напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children); //напишите тут ваш код
        }

        public String toString() {
            StringBuilder text = new StringBuilder();
            text.append("Имя: ").append(this.name);
            text.append(", пол: ").append(this.sex ? "мужской" : "женский");
            text.append(", возраст: ").append(this.age);

            int childCount = this.children.size();
            if (childCount > 0) {
                text.append(", дети: ").append(this.children.get(0).name);

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text.append(", ").append(child.name);
                }
            }
            return text.toString();
        }
    }
}