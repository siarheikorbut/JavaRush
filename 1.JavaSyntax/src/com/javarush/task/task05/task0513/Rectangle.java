package com.javarush.task.task05.task0513;                                                                                                                                                                                                        
                                                                                                                                                                                                        
/*                                                                                                                                                                                                         
Собираем прямоугольник                                                                                                                                                                                                        
*/

public class Rectangle {
    int top, left, width, height;

    public void initialize(int top) {
        this.top = top;
        this.left = 1;
        this.width = 2;
        this.height = 3;
    }

    public void initialize(int top, int left) {//напишите тут ваш код
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
    }
}