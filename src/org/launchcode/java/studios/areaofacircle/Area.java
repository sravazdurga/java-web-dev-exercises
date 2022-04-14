package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        System.out.print("Enter a radius: ");
        Scanner sn = new Scanner(System.in);
        Double radius = sn.nextDouble();
        if(radius/2 == 0 || radius == null) {
            Double area = Circle.getArea(radius); //Math.PI * radius * radius;
            System.out.println("The area of a circle of radius " + radius + " is: = " + area);
        }else{
            System.out.println("Please enter a positive number: ");
        }
    }

}
