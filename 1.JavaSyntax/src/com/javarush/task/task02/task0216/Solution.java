package com.javarush.task.task02.task0216;

/*                                                                                                                                                                                                                                                                                                             
Минимум трёх чисел                                                                                                                                                                                                                                                                                                            
*/

public class Solution {
    public static int min(int a, int b, int c) {
        int m2;
        if (a <= b && a <= c)
            m2 = a;
        else if (b <= a && b <= c)
            m2 = b;
        else m2 = c;

        return m2;//напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}