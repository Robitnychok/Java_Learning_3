package part4_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Methods5 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("hi");
        arrayList1.add("ok");
        arrayList1.add("bye");
        arrayList1.add("?");
        System.out.println(arrayList1);

        List<String> list = arrayList1.subList(1,3);
        System.out.println(list);


        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("hi");
        arrayList2.add("ok");
        arrayList2.add("no");
        System.out.println(arrayList2);

       /* arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);*/



    }
}
