package part6_Lambda.test;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("HI");
        arrayList.add("Learning");
        arrayList.add("Java");
        arrayList.add("Bye");

        Predicate<String> p = element -> element.length()<5;
        arrayList.removeIf(p);
        // arrayList.removeIf(element -> element.length()<5);
        System.out.println(arrayList);
    }
}
