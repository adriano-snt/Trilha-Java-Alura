/*
Write a Java program to count the number of key-value (size) mappings in a map.
 */

import java.util.HashMap;
import java.util.Map;

public class ex2_Count_The_Number_Of_Key_size {
    public static void main(String[] args) {
        Map<Integer, String> hMap = new HashMap<>();
        hMap.put(1, "A");
        hMap.put(2, "B");
        hMap.put(3, "C");
        hMap.put(4, "D");

        int count = 0;

        System.out.println("Count before the sum: " + count);
        hMap.keySet();
        for (Integer s : hMap.keySet()) {
            count++;
        }

        System.out.println("Count after the sum: " + count);
    }

}
