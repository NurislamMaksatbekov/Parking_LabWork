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

    public void makeCars(List<Car> cars) {
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
        Random rnd = new Random();
        for (Car car : cars) {
            int rndNum = rnd.nextInt(100) + 1;
            if(car.state && rndNum <= 3){
                car.state = false;
            }else if(!car.state && rndNum <= 3){
                car.state = true;
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
