package part4_Collections.map_Interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {

        LinkedHashMap <Studentik, Double> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);

        Studentik st1 = new Studentik("Sofia", "Rudenko", 1);
        Studentik st2 = new Studentik("Vitalij", "Rudenko", 4);
        Studentik st3 = new Studentik("Katya", "Mac", 2);
        Studentik st4 = new Studentik("Julia", "Pis", 9);

        linkedHashMap.put( st1, 2.3);
        linkedHashMap.put( st2,8.9 );
        linkedHashMap.put( st3, 12.4);
        linkedHashMap.put( st4, 63.2);

        System.out.println(linkedHashMap);
    }
}
