package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {

    public static int getNOD(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new ArithmeticException();
        }
        while (x != 0 && y != 0) {
            if (x > y) x = x % y;
            else y = y % x;
        }
        return x + y;
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber;
        int secondNumber;
        try {
            if (((firstNumber = Integer.parseInt(reader.readLine())) < 0) || ((secondNumber = Integer.parseInt(reader.readLine())) < 0)) {
                throw new IOException();
            }
            reader.close();
            System.out.println("НОД введённых чисел = " + getNOD(firstNumber, secondNumber));
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        } catch (ArithmeticException e) {
            System.out.println("Вееден ноль");
        } catch (IOException e) {
            System.out.println("Введено отрицательное число");
        }
    }
}