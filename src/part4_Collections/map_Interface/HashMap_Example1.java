package part4_Collections.map_Interface;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example1 {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Sofia");
        map1.put(252, "Vitalij");
        map1.put(1, "Vitalij");
        map1.put(8452, "Viki");
        map1.put(1358, "Viki");
        map1.put(696, "Ivan");
        map1.putIfAbsent(696, "g");

        System.out.println(map1);
        System.out.println(map1.get(1));

        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(1,1230);
        map2.put(8968,1786230);
        map2.put(445,124530);
        map2.put(4548,17895230);
        map2.put(54,1230);
    }
}
