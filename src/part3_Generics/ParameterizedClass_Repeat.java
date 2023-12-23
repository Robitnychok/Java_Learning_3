package part3_Generics;

public class ParameterizedClass_Repeat {
    public static void main(String[] args) {

        TestClass <String> testClass1 = new TestClass<>("Hiii");
        System.out.println(testClass1);

        TestClass <Integer> testClass2 = new TestClass<>(12);
        System.out.println(testClass2);

        TestWith2Par <String, Integer> testWith2Par1 = new TestWith2Par<>("HI", 15);
        System.out.println(testWith2Par1);

    }
}

class TestClass  <T> {
    private T value;

    public TestClass(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "<{" + value + ">}";
    }
}

class TestWith2Par <T1, T2> {
    private T1 value1;
    private T2 value2;

    public TestWith2Par(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "TestWith2Par{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }

    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }
}