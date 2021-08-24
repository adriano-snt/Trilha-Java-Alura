/*
ex13 -> https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 */

import java.util.Scanner;

public class ex4_Area_And_Perimeter_Of_A_Retangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input width: ");
        double width = scan.nextDouble();

        System.out.print("Input height: ");
        double height = scan.nextDouble();

        double area = width * height;
        double perimeter = (2*width) + (2*height);

        System.out.println("Area of the rectangle is: " + area);
        System.out.println("Perimeter of the rectangle is: " + perimeter);


    }
}
