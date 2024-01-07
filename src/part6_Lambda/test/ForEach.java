package part6_Lambda.test;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List <String> list = List.of("Hi", "how are you?", "I am ok", "Good");
        for (String s : list  ) {
            System.out.println(s);
        }
        list.forEach(string -> System.out.println(string));

        List <Integer> list2 = List.of(1, 2, 3, 4);
        for (Integer i: list2){
            System.out.println(i);
        }
        list2.forEach(integer -> {System.out.println(integer); integer*=2;
            System.out.println(integer);});
    }
}
