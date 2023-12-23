package part3_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("OK");
        list.add(12);
        list.add(new Car());
    }
}

class Car {

}