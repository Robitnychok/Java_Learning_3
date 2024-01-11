package part7_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result = list.stream().reduce((accumulator, element) -> accumulator*element).get();
        // accumulator = 5 40 80 320 960
        // element =     8  2  4   3
        System.out.println(result);

        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator*element);
        // accumulator = 1  5 40 80 320 960
        // element =     5  8  2  4   3
        System.out.println(result2);

        List <String> list3 = new ArrayList<>();
        list3.add("Hi");
        list3.add("I");
        list3.add("am");
        list3.add("here");
        list3.add("now");
        String result3 = list3.stream().reduce((a,e) -> a + " " + e).get();
        System.out.println(result3);



        List <Integer> list100 = new ArrayList<>();
        Optional <Integer> o = list100.stream().reduce((accumulator, element) -> accumulator*element);
        if (o.isPresent()){
            System.out.println(o);
        } else {
            System.out.println("Not present");
        }
    }
}
