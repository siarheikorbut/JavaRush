package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> numbersEvenlyDivisibleBy3 = new ArrayList<>();
        ArrayList<Integer> numbersEvenlyDivisibleBy2 = new ArrayList<>();
        ArrayList<Integer> otherNumbersFromArray = new ArrayList<>();

        for (Integer integer : list) {
            if (integer % 3 == 0 && integer % 2 == 0) {
                numbersEvenlyDivisibleBy3.add(integer);
                numbersEvenlyDivisibleBy2.add(integer);
            } else if (integer % 3 == 0) {
                numbersEvenlyDivisibleBy3.add(integer);
            } else if (integer % 2 == 0) {
                numbersEvenlyDivisibleBy2.add(integer);
            } else {
                otherNumbersFromArray.add(integer);
            }
        }
        printList(numbersEvenlyDivisibleBy3);
        printList(numbersEvenlyDivisibleBy2);
        printList(otherNumbersFromArray);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}