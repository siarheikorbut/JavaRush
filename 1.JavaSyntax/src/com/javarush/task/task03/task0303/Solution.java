package com.javarush.task.task03.task0303;                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                            
/*                                                                                                                                                                                                                                                                                                             
Обмен валют                                                                                                                                                                                                                                                                                                            
*/                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                            
public class Solution {                                                                                                                                                                                                                                                                                                            
    public static void main(String[] args) {                                                                                                                                                                                                                                                                                                            
        System.out.println(convertEurToUsd (5, 2.45));                                                                                                                                                                                                                                                          
        System.out.println(convertEurToUsd (6, 2.45));//напишите тут ваш код
    }                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                            
    public static double convertEurToUsd(int eur, double exchangeRate) {                                                                                                                                                                                                                                                                                                            
        double usd;
        usd = eur * exchangeRate;
        return usd;//напишите тут ваш код
    }                                                                                                                                                                                                                                                                                                            
}