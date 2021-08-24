/*
ex12 -> https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program that takes three numbers as
input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class ex3_Three_Numbers_Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first number");
        int num1 = scan.nextInt();

        System.out.println("Input second number");
        int num2 = scan.nextInt();

        System.out.println("Input third number");
        int num3 = scan.nextInt();

        int average = ((num1 + num2 + num3)/3);

        System.out.println("The average of the numbers is : " + average);


    }
}
