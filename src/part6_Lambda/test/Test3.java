package part6_Lambda.test;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> a1 = new ArrayList<>();
        for (int i = 0; i<3; i++){
            a1.add(carSupplier.get());
        }
        return a1;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
            ArrayList <Car> ourCars = createThreeCars(
                    () -> new Car("Nissan", "Blue", 1.6)
            );
            System.out.println("Our cars are "+ ourCars);

            changeCar(ourCars.get(0), car -> {car.colour = "Red"; car.engine = 2.4;
                System.out.println("Upgraded car "+ car);});

        }
    }


class Car{
    String model;
    String colour;
    double engine;

    public Car(String model, String colour, double engine) {
        this.model = model;
        this.colour = colour;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                '}';
    }
}