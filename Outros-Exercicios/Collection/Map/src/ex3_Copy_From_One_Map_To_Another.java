/*
Write a Java program to copy all the mappings from the specified map to another map.
 */

import java.util.HashMap;
import java.util.Map;

public class ex3_Copy_From_One_Map_To_Another {
    public static void main(String[] args) {
        Map<Integer, String> hMap = new HashMap<>();
        hMap.put(1, "A");
        hMap.put(2, "B");
        hMap.put(3, "C");
        hMap.put(4, "D");

        System.out.println("Original map: " + hMap);

        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.putAll(hMap);

        System.out.println("Other Map: " + otherMap);


    }
}
