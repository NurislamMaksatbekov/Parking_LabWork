import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        LocalDateTime ldt = LocalDateTime.now();
        Car car = new Car();//
        List<Car> cars = new ArrayList<>();
        for (LocalDateTime i = ldt; i.isBefore(ldt.plusDays(5)); i = i.plusMinutes(60)) {
            City.makeCars(cars);
            Note.parking(cars);
            Note.printNote();
        }
    }
}