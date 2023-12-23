package part3_Generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {

        Pair <String, Integer> pair1 = new Pair <> ("Hi " ,12);
        System.out.println("value 1 = " + pair1.getFirstValue() + "value2 = " +
                pair1.getSecondValue());

        Pair <Integer, Double> pair2 = new Pair <> (12 , 12.12);
        System.out.println("value 1 = " + pair2.getFirstValue() + "value2 = " +
                pair2.getSecondValue());

        OnePair <String> onePair1 = new OnePair<>("Hi", "ok");
        System.out.println("Value 1 = " + onePair1.getVal1() + " Value 2 =" +
                onePair1.getVal2());

    }
}

class Pair < V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue (){
        return value1;
    }
    public V2 getSecondValue (){
        return value2;
    }
}

class OnePair <T>{
    private T val1;
    private T val2;

    public OnePair(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
    public T getVal1(){
        return val1;
    }
    public T getVal2(){
        return val2;
    }
}