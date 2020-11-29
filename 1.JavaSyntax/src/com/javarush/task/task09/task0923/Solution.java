package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] lettersAndSymbols = s.toCharArray();

        List<String> vowels = new ArrayList<>();
        List<String> consonantsAndSymbols = new ArrayList<>();

        for (char lettersAndSymbol : lettersAndSymbols) {
            if (isVowel(lettersAndSymbol)) {
                vowels.add(lettersAndSymbol + " ");
            } else if (!isVowel(lettersAndSymbol) && lettersAndSymbol != ' ') {
                consonantsAndSymbols.add(lettersAndSymbol + " ");
            }
        }

        for (String vowel : vowels) {
            System.out.print(vowel);
        }

        System.out.println();

        for (String consonantsAndSymbol : consonantsAndSymbols) {
            System.out.print(consonantsAndSymbol);
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}