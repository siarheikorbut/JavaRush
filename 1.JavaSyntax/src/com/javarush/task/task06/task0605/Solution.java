package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double m = weight / (height * height);
            if (m < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");// напишите тут ваш код
            }
            if (m > 18.5 && m < 25.0) {
                System.out.println("Нормальный: между 18.5 и 25");
            }
            if (m > 25.0 && m < 30.0) {
                System.out.println("Избыточный вес: между 25 и 30");
            }
            if (m >= 30.0) {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
