package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.1, "A");
        labels.put(2.2, "B");
        labels.put(3.3, "C");
        labels.put(4.4, "D");
        labels.put(5.5, "E");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}