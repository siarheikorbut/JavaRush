package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        int i = 0;
        int j = 0;

        if (this.weight > anotherCat.weight) {
            i++;
        } else if (this.weight != anotherCat.weight) {
            j++;
        }
        if (this.age > anotherCat.age) {
            i++;
        } else if (this.age != anotherCat.age) {
            j++;
        }
        if (this.strength > anotherCat.strength) {
            i++;
        } else if (this.strength != anotherCat.strength) {
            j++;
        }//напишите тут ваш код

        if (i == j) {
            return false;
        } else {
            return i > j;
        }
    }

    public static void main(String[] args) {
    }
}
