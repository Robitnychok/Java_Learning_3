package part4_Collections;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hi");
        list1.add("ok");
        list1.add("bye");

        ArrayList<String> list2 = new ArrayList<>(30);
        list2.add("tht");
        list2.add("fyh");

        ArrayList<String> list3 = new ArrayList<>(list2);
        System.out.println(list3);
    }
}
