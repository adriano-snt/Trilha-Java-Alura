/*
    Write a Java program to associate the specified value with
    the specified key in a HashMap
     */

import java.util.HashMap;
import java.util.Map;

public class ex1_Associating_Value_To_Your_Specific_Key {

    public static void main(String[] args) {
        Map<Integer, String> hMap = new HashMap<>();
        hMap.put(1, "A");
        hMap.put(2, "B");
        hMap.put(3, "C");
        hMap.put(4, "D");

        System.out.println("Original HashMap: " + hMap);
        System.out.println("HashMap cleared");
        hMap.clear();
    }


}
