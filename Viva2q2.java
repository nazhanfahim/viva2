/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viva2q2;
import java.util.*;
/**
 *
 * @author Dell
 */
public class Viva2q2 {

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Choose the shape to calculate the area:\n"+"1. Circle\n" +"2. Rectangle\n" +"3. Triangle");
        System.out.print("Enter your choice: ");
        int choice=kb.nextInt();
        switch(choice){
            case 1:{
                System.out.print("Enter the radius of the circle: ");
                double radius=kb.nextDouble();
                System.out.printf("The area of the cirlce is: "+"%.2f",calculateCircleArea(radius));
                break;
            }
            case 2:{
                System.out.print("Enter the length of the rectangle: ");
                double length=kb.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width=kb.nextDouble();
                System.out.printf("The area of the rectangle is: "+"%.2f",calculateRectangleArea(length, width));
                break;
            }
            case 3:{
                System.out.print("Enter the base of the triangle: ");
                double base=kb.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height=kb.nextDouble();
                System.out.printf("The area of the triangle is:"+"%.2f",calculateTriangleArea(base, height));
                break;
            }
            default:{
                System.out.println("Invalid choice, Try Again!");
                break;
            }
        }
    }
    public static double calculateCircleArea(double r){
        double area;
        area=Math.PI*(Math.pow(r,2));
        
        return area;
    }
    
    public static double calculateRectangleArea(double l, double w){
        double area;
        area=l*w;
        return area;
    }
    
     public static double calculateTriangleArea(double b, double h){
        double area;
        area=(b*h)/2;
        return area;
        
    }
}
