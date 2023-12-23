package part4_Collections;

import java.util.ArrayList;

public class ArrayList_Methods3 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hi");
        list1.add("ok");
        list1.add("bye");
        System.out.println(list1);

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("???");
        list2.add(">>>");
        list2.add("<<<???>>>");

        list1.addAll(1, list2);

        System.out.println(list1);

    }
}
