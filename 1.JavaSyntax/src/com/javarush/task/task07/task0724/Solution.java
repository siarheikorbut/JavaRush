package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human("Иван", true, 27);
        Human human2 = new Human("Петр", true, 34);
        Human human3 = new Human("Елена", false, 20);
        Human human4 = new Human("Вика", false, 50);
        Human human5 = new Human("Вика", false, 20, human1, human3);
        Human human6 = new Human("Екатерина", false, 18, human2, human4);
        Human human7 = new Human("Милана", false, 15, human1, human3);
        Human human8 = new Human("Марианна", false, 14, human2, human4);
        Human human9 = new Human("Ксения", false, 10, human1, human3);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());
    }// напишите тут ваш код


    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }// напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}