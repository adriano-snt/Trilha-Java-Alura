/*
ex38 ->https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to count the letters, spaces, numbers and other characters of an input string.

 */

public class ex7_Count_Letters_Spaces_Numbers_And_Others {
    public static void main(String[] args) {
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        char[] toChar = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(toChar[i])) {
                letter++;
            } else if (Character.isSpaceChar(toChar[i])) {
                space++;
            } else if (Character.isDigit(toChar[i])) {
                number++;
            } else {
                other++;
            }
        }

        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}
