package com.javarush.task.task05.task0520;                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                          
/*                                                                                                                                                                                                                                                           
Создать класс прямоугольник (Rectangle)                                                                                                                                                                                                                                                          
*/
                                                                                                                                                                                                                                                          
public class Rectangle {                                                                                                                                                                                                                                                          
    int top, left, width, height;                                                                                                                                                                                                        
                                                                                                                                                                                                        
    public Rectangle(int top) {                                                  
       this.top = top;                                                  
       this.left = 2;                                                  
       this.width = 3;                                                  
       this.height = 4;                                                  
       }                                                  
    public Rectangle(int top, int left) {                                                  
       this.top = top;                                                  
       this.left = left;                                                  
       this.width = 0;                                                  
       this.height = 0;                                                  
       }                                                  
    public Rectangle(int top, int left, int width) {                                                  
       this.top = top;                                                  
       this.left = left;                                                  
       this.width = width;                                                  
       this.height = width;                                                  
       }                                                  
    public Rectangle(int top, int left, int width, int height) {                                                  
       this.top = top;                                                  
       this.left = left;                                                  
       this.width = width;                                                  
       this.height = height;                                                  
       }//напишите тут ваш код                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                          
    public static void main(String[] args) {
    }                                                                                                                                                                                                                                                          
}