import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Parking {
    private static Car car = new Car();
    private int freeSpace;

    public Parking() {
        this.freeSpace = 20;
    }
}
