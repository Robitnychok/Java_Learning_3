package part4_Collections.set_Interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Sofia");
        set.add("Vitalij");
        set.add("Viki");
        set.add("Katya");
       // set.add(null);
        set.remove("Katya");

        for (String s : set  ) {
            System.out.println(s);
        }
        System.out.println(set.size());
    }
}
