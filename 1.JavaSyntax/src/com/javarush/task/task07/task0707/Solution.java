package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        list.add("s1");
        list.add("s2");
        list.add("s3");
        list.add("s4");
        list.add("s5");

        int n = list.size();

        System.out.println(n);

        for (String i : list) {
            System.out.println(i);
        }//напишите тут ваш код
    }
}
