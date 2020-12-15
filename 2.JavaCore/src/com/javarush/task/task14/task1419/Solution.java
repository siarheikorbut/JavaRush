package com.javarush.task.task14.task1419;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        //Exception 1
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //Exception 2
        try {
            throw new IOException();//напишите тут ваш код
        } catch (IOException e) {
            exceptions.add(e);
        }

        //Exception 3
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }

        //Exception 4
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException e) {
            exceptions.add(e);
        }

        //Exception 5
        try {
            throw new EOFException();
        } catch (EOFException e) {
            exceptions.add(e);
        }

        //Exception 6
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        //Exception 7
        try {
            throw new MalformedURLException();
        } catch (MalformedURLException e) {
            exceptions.add(e);
        }

        //Exception 8
        try {
            throw new UnknownHostException();
        } catch (UnknownHostException e) {
            exceptions.add(e);
        }

        //Exception 9
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            exceptions.add(e);
        }

        //Exception 10
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
    }
}