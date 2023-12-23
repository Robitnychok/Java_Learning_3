package part2_Comparable_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3_repeat {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        Collections.sort(list);
        System.out.println(list);
    }
}

