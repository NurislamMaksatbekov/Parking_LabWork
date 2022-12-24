import java.util.List;

public class City {
    public static void makeCars(List<Car> cars) {
        int a = 0;
        int number = 1;
        while (a < 200) {
            Car car = new Car();
            car.setNumber(number);
            cars.add(car);
            cars.get(a).setNumber(a);
            number++;
            a++;
        }
    }
}
