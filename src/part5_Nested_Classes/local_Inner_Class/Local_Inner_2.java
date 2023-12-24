package part5_Nested_Classes.local_Inner_Class;

public class Local_Inner_2 {
    public static void main(String[] args) {

        class Plus implements Math2{

            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }

        Plus plus = new Plus();
        System.out.println(plus.doOperation(2,3));
    }

}

interface Math2{
    int doOperation (int a, int b);
}