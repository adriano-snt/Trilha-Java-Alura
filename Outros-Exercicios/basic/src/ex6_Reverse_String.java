/*
ex37 ->https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to reverse a string.

 */

import java.util.Scanner;

public class ex6_Reverse_String {
    public static void main(String[] args) {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String text = read.nextLine();

        System.out.println("String : " + text);

        //Using String Buffer
        StringBuffer sbfr = new StringBuffer(text);

        System.out.println("inverted string with StringBuffer");
        System.out.println(sbfr.reverse());

        //Using String Builder
        StringBuilder sbld = new StringBuilder();
        sbld.append(text);
        sbld.reverse();
        System.out.println("inverted string with StringBuilder");
        System.out.println(sbld);

        //Using loop
        String reverse = "";

        for (int i = text.length()-1; i >=0; i-- ){
            reverse += text.charAt(i);
        }

        System.out.println("inverted string with loop");
        System.out.println(reverse);

    }
}
