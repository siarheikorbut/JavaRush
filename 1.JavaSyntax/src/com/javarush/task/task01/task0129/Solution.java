package com.javarush.task.task01.task0129;

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double length = 2 * 3.14 * radius;
        System.out.println(length);
    }
}