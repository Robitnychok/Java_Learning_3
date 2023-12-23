package part3_Generics;

public class ParameterizedClass {
    public static void main(String[] args) {

        Info <String> inf = new Info <> ("HI");
        System.out.println(inf);
        String s = inf.getValue();
        System.out.println(s);

        Info <Integer> inf2 = new Info <> (12);
        System.out.println(inf2);
        Integer n = inf2.getValue();
        System.out.println(n);



     }
}

class Info <T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "<{" + value + "}>";
    }

    public T getValue (){
        return value;
    }
}
