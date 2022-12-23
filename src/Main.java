import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public void run(){
        Car car = new Car();
        Parking parking = new Parking();
        List<Car> cars = new ArrayList<>();
        car.makeCars(cars);
        car.goParking(cars);
        List<Car> parkingPlase = new ArrayList<>();
        parking.parkingFill(cars, parkingPlase);
        System.out.println(parkingPlase);
    }
}