package com.javarush.task.task01.task0132;                                                                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                                                
/*                                                                                                                                                                                                                                                                                                                                                                                                                 
Сумма цифр трехзначного числа                                                                                                                                                                                                                                                                                                                                                                                                                
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sumDigitsInNumber = 0;
        int currentDigit;

        currentDigit = number % 10;
        sumDigitsInNumber = sumDigitsInNumber + currentDigit;

        number = number / 10;

        currentDigit = number % 10;
        sumDigitsInNumber = sumDigitsInNumber + currentDigit;

        number = number / 10;

        sumDigitsInNumber = sumDigitsInNumber + number;

        return sumDigitsInNumber;//напишите тут ваш код                                                                                                                                                                                                                                                                                                                                                                                                                
    }
}