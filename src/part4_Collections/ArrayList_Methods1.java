package part4_Collections;

import java.util.ArrayList;

public class ArrayList_Methods1 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hi");
        list1.add("ok");
        list1.add("bye");
        list1.add(1, "here");

        for (String s: list1){
            System.out.print(s + " ");
        }

        System.out.println(list1.get(2));

        list1.set(3, "hii");
        System.out.println(list1);

        list1.remove(0);
        System.out.println(list1);
    }
}
