import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        List<Car> cars = new ArrayList<>();
        car.makeNumber(cars);
        System.out.println(cars);
    }
}