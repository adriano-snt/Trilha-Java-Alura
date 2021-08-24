/*
ex7 ->https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program that takes a number as input and
prints its multiplication table upto 10.
 */

import java.util.Scanner;

public class ex2_Number_multiplied_by_10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");

        int num = in.nextInt();

        for(int i = 0; i < 10 ; i++){
            System.out.println(num + " x " + (i+1) + " = " + (num*i+1));
    }
}
}
