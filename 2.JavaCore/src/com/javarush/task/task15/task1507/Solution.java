package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    //1
    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    //2
    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    //3
    public static void printMatrix(byte m, byte n, String value) {

    }

    //4
    public static void printMatrix(Byte m, Byte n, String value) {

    }

    //5
    public static void printMatrix(Integer m, Integer n, String value) {

    }

    //6
    public static void printMatrix(long m, long n, String value) {

    }

    //7
    public static void printMatrix(Long m, Long n, String value) {

    }

    //8
    public static void printMatrix(float m, float n, String value) {

    }

    //9
    public static void printMatrix(Float m, Float n, String value) {

    }

    //10
    public static void printMatrix(double m, double n, String value) {

    }
}