package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 16 2001"));
        map.put("Петров", dateFormat.parse("JULY 2 1989"));
        map.put("Сидоров", dateFormat.parse("AUGUST 15 1986"));
        map.put("Козлов", dateFormat.parse("SEPTEMBER 23 2000"));
        map.put("Карпов", dateFormat.parse("OCTOBER 5 1990"));
        map.put("Цветков", dateFormat.parse("NOVEMBER 18 2008"));
        map.put("Горшков", dateFormat.parse("DECEMBER 14 2013"));
        map.put("Стулов", dateFormat.parse("FEBRUARY 12 2012"));
        map.put("Шкафов", dateFormat.parse("JANUARY 27 2004"));
        return map;//напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        List<String> list = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        for (Map.Entry<String, Date> pair : map.entrySet()) {
            String key = pair.getKey();
            Date value = pair.getValue();

            String s = value.toString();

            if (s.contains("Jun") || s.contains("Jul") || s.contains("Aug")){
                list.add(key);
            }
        }
        for (String s : list) {
            map.remove(s);
        }
    }//напишите тут ваш код

    public static void main(String[] args) {
    }
}
