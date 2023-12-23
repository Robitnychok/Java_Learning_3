package part4_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(-30);
        arrayList.add(8);
        arrayList.add(19);
        arrayList.add(150);
        arrayList.add(10);
        arrayList.add(-8);
        arrayList.add(5);
        arrayList.add(-3);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(12);

        Collections.sort(arrayList );

        int index1 = Collections.binarySearch(arrayList, 19);
        System.out.println(index1);

    }
}
