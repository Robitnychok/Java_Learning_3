package part7_Stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int [] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(element -> {element*=2;
            System.out.println(element);});

        Arrays.stream(array).forEach(Util :: myMethod); //or you may write the same as belowe
        Arrays.stream(array).forEach(element -> Util.myMethod(element)); //the same as above

    }
}

class Util{
    public static void myMethod (int a){
        a=a+5;
        System.out.println("Element" + a);
    }
}