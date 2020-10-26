package com.javarush.task.task05.task0510;                                                                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                                                
/*                                                                                                                                                                                                                                                                                                                                                                                                                 
Кошкоинициация                                                                                                                                                                                                                                                                                                                                                                                                                
*/

public class Cat {
    String name = null;
    int age;
    int weight;
    String address = null;
    String color;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }//напишите тут ваш код

    public static void main(String[] args) {
    }
}