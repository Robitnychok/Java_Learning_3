package part4_Collections.map_Interface;

import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {

        TreeMap <Studentik,Double> treeMap = new TreeMap<Studentik, Double>();
        Studentik st1 = new Studentik("Sofia", "Rudenko", 1);
        Studentik st2 = new Studentik("Vitalij", "Rudenko", 4);
        Studentik st3 = new Studentik("Katya", "Mac", 2);
        Studentik st4 = new Studentik("Julia", "Pis", 9);
        Studentik st5 = new Studentik("Angelina", "Xz", 6);
        Studentik st6 = new Studentik("Lolita", "Atiol", 12);
        Studentik st7 = new Studentik("Anna", "Baga", 3);
        Studentik st8 = new Studentik("Anna", "Baga", 3);
        treeMap.put( st1, 2.3);
        treeMap.put( st2,8.9 );
        treeMap.put( st3, 12.4);
        treeMap.put( st4, 63.2);
        treeMap.put( st5, 78.2 );
        treeMap.put( st6, 63.4);
        treeMap.put( st7, 2.8 );
        treeMap.put( st8,3.2);
        System.out.println(treeMap);

    }
}
