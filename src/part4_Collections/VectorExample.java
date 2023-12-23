package part4_Collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector <String> vector = new Vector<>();
        vector.add("Sofia");
        vector.add("Vitalij");
        vector.add("Angelina");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);

        System.out.println(vector.get(0));
    }
}
