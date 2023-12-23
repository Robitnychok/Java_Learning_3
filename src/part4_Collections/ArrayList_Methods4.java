package part4_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Methods4 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder [] array = {sb1, sb2, sb3, sb4};
        List <StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("!!!");
        System.out.println(list);
        List<StringBuilder> arrayList = new ArrayList<>(list);
        StringBuilder e = new StringBuilder("E");
        arrayList.add(e);
        System.out.println(arrayList);
    }
}
