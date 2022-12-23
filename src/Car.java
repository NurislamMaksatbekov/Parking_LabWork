import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {
    private boolean state;
    private int number;


    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Car() {
        this.state = true;
    }

    public void makeNumber(List<Car> cars) {
        int a = 0;
        while (a < 200) {
            cars.add(makeCar());
            cars.get(a).number = a;
            a++;
        }
    }

    public Car makeCar() {
        int number = 1;
        Car car = new Car();
        car.number = number;
        return car;
    }

    public void goParking(List<Car> cars) {
        for (Car car : cars) {
            if(car.state){
                Random rnd = new Random();
                int rndNum = rnd.nextInt(100) + 1;
                if (rndNum <= 3) {
                    car.state = !car.state;
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "state=" + state +
                ", number=" + number +
                '}' + "\n";
    }
}
