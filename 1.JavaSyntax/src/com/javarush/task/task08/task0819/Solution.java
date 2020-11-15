package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());//напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Set<Cat> catSet = new HashSet<>();
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        return catSet; //напишите тут ваш код. step 2 - пункт 2
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }// step 4 - пункт 4
    }

    public static class Cat {

    }// step 1 - пункт 1
}
