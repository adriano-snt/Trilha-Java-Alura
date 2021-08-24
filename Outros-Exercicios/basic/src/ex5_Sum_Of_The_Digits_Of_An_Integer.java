/*
ex33 ->https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program and compute the sum of the digits of an integer.

Test Data:
Input an intger: 25
The sum of the digits is: 7
 */

import java.util.Scanner;

public class ex5_Sum_Of_The_Digits_Of_An_Integer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer: ");
        long x = scan.nextLong();

        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);




    }
}
