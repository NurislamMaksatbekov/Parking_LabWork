import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {
    private boolean state;
    private int number;
    private int totalSum;


    private static Random rnd = new Random();
    public Car() {
        this.state = true;
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

