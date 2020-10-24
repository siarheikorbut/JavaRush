package com.javarush.task.task02.task0217;

/*                                                                                                                                                                                                                                                                                                                                                               
Минимум четырех чисел                                                                                                                                                                                                                                                                                                                                                              
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        int min = 0;

        if (a <= b && a <= c && a <= d) min = a;
        if (b <= a && b <= c && b <= d) min = b;
        if (c <= a && c <= b && c <= d) min = c;
        if (d <= a && d <= b && d <= c) min = d;
        return min;//напишите тут ваш код
    }

    public static int min(int a, int b) {

        int min = 0;

        if (a <= b) min = a;
        if (b <= a) min = b;
        return min;//напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}