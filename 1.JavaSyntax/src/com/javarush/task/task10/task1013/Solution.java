package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {

        private String sex;
        private String name;
        private String surname;
        private int age;
        private String country;
        private String city;

        public Human(String sex) {
            this.sex = sex;
        }

        public Human(String sex, String name) {
            this.sex = sex;
            this.name = name;
        }

        public Human(String sex, String name, String surname) {
            this.sex = sex;
            this.name = name;
            this.surname = surname;
        }

        public Human(String sex, String name, String surname, int age) {
            this.sex = sex;
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String sex, String name, String surname, int age, String country) {
            this.sex = sex;
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.country = country;
        }

        public Human(String sex, String name, String surname, int age, String country, String city) {
            this.sex = sex;
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.country = country;
            this.city = city;
        }

        public Human(String name, String surname, int age, String country, String city) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.country = country;
            this.city = city;
        }

        public Human(String surname, int age, String country, String city) {
            this.surname = surname;
            this.age = age;
            this.country = country;
            this.city = city;
        }

        public Human(int age, String country, String city) {
            this.age = age;
            this.country = country;
            this.city = city;
        }

        public Human(String city, String country, int age) {
            this.city = city;
            this.country = country;
        }
    }// Напишите тут ваши переменные и конструкторы
}
