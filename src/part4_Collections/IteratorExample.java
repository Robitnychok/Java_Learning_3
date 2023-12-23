package part4_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("hi");
        arrayList1.add("ok");
        arrayList1.add("bye");
        arrayList1.add("?");

        Iterator <String> iterator = arrayList1.iterator();

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//
//            iterator.next();
//            iterator.remove();
//        }
//

        while (iterator.hasNext()){
            String str = iterator.next();
            if (str.equals("hi")) {
                iterator.remove();
            }
            System.out.println(iterator.next());
        }


    }
}
