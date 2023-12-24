package part5_Nested_Classes.inner_Class;

public class Car {

        String colour;
        int doorCount;
        Engine engine;

        public Car(String colour, int doorCount) {
            this.colour = colour;
            this.doorCount = doorCount;
//            this.engine = this.new Engine(horsePower);
        }

        public void setEngine (Engine engine){
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

        public class Engine{
            int horsePower;

            public Engine(int horsePower) {
                this.horsePower = horsePower;
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

            // Car car = new Car("Red", 2, 150);
            Car car = new Car("Brown", 4);
            Car.Engine engine = car.new Engine(150);
            car.setEngine(engine);

            System.out.println(engine);
            System.out.println(car);
        }
    }

