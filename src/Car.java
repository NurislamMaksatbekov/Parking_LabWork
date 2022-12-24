import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {
    private boolean state;
    private int number;
    private static Random rnd = new Random();
    public Car() {
        this.state = true;
    }


    public Car makeCar() {
        int number = 1;
        Car car = new Car();
        car.number = number;
        return car;
    }


    @Override
    public String toString() {
        return "Car{" +
                "state=" + state +
                ", number=" + number +
                '}';
    }

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
}

