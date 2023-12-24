package part5_Nested_Classes.anonymous_Inner_Class;

public class AnonymousClass {
    private int a = 5;
    public static void main(String[] args) {

        Math3 m = new Math3() {

            @Override
            public int doOperation(int x, int y) {
                AnonymousClass ac = new AnonymousClass();
                return x-y+ac.a;
            }
        };
        Math3 m2 = new Math3() {
            @Override
            public int doOperation(int x, int y) {
                return x*y;
            }
        };
        System.out.println(m.doOperation(10,7));
        System.out.println(m2.doOperation(15,12));
    }
}

interface Math3{
    int doOperation (int x, int y);
}