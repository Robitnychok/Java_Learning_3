package part3_Generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {

//List<Number> list = new ArrayList<Integer>(); - tak neza
  List <?> list = new ArrayList<Integer>();  // - tak mozno

        List <Double> list1 = new ArrayList<>();
        list1.add(3.15);
        list1.add(3.16);
        list1.add(3.17);

        List <String> list2 = new ArrayList<>();
        list2.add("hi");
        list2.add("ok");
        list2.add("bye");

        showInfo(list1);
        showInfo(list2);

        ArrayList <Double> listik1 = new ArrayList<>();
        listik1.add(3.15);
        listik1.add(3.16);
        listik1.add(3.17);
        System.out.println(summNumbers(listik1));

        ArrayList <Integer> listik2 = new ArrayList<>();
        listik2.add(25);
        listik2.add(36);
        listik2.add(57);
        System.out.println(summNumbers(listik2));



    }
    static void showInfo (List <?> list){

        System.out.println("This list contains next info " + list);
    }

    public static double summNumbers (ArrayList<? extends Number> al){
        double summ = 0;
        for (Number n :al ) {
            summ  += n.doubleValue();
        }
        return summ;
    }
}

