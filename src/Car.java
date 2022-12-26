import java.util.Random;

public class Car {
    private boolean state;
    private int number;


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

