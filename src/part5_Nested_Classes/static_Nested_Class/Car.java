package part5_Nested_Classes.static_Nested_Class;

public class Car {
    String colour;
    int doorCount;
    Engine engine;

    public Car(String colour, int doorCount, Engine engine) {
        this.colour = colour;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "My Car: {" +
                "colour='" + colour + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        int horsePower;
        static int countObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countObjects++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

}

class Test{
    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("white", 4, engine);
        System.out.println(car);
    }
}