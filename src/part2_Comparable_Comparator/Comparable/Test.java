package part2_Comparable_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Sofia");
        list.add("Vitalij");
        list.add("Julia");

        System.out.println("Before sorting");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("After sorting");
        System.out.println(list);

    }
}
