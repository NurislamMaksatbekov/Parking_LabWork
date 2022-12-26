import java.util.ArrayList;
import java.util.List;

public class City {
    List<Car> cars;


    public City() {
        this.cars = makeCars();
    }

    public List<Car> makeCars() {
        int a = 0;
        List<Car> cars1 = new ArrayList<>();
        int number = 1;
        while (a < 200) {
            Car car = new Car();
            car.setNumber(number);
            cars1.add(car);
            cars1.get(a).setNumber(a);
            number++;
            a++;
        }
        return cars1;
    }

}
