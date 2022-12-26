import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.List;
import java.util.Random;

public class Note {

    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Car carInParking;
    private int sum;

    private static Random rnd = new Random();

    public Note() {
        this.checkIn = LocalDateTime.now();
        this.checkOut = LocalDateTime.now();
        this.sum = checkSum();
    }

    //    public Note() {
//        this.sum = checkSum();
//        this.checkIn = LocalDateTime.now();
//        this.checkOut = LocalDateTime.now();
//    }

    public void checkParking(Car car) {
        int rndNum = rnd.nextInt(100) + 1;
        LocalDateTime a = getCheckIn().plusMinutes(5);
        Parking parking = new Parking();
        try {
            if (!car.isState()) {
                if (rndNum <= 3) {
                    car.setState(true);
                    parking.setFreeSpace(+1);
                } else {
                    setCheckOut(a);
                }
            } else {
                if (rndNum <= 3) {
                    car.setState(false);
                    setCarInParking(car);
                    parking.setFreeSpace(-1);
                }
                else if (parking.getFreeSpace() == 0){
                    throw new NumberFormatException();
                }
            }
        }catch (NumberFormatException e){
            System.out.println("На парковке нет мест!");
        }
    }

    public void printNote() {
        City city = new City();
        System.out.println("| НОМЕР |          ВРЕМЯ ЗАЕЗДА            |          ВРЕМЯ ВЫЕЗДА           |     ЗАДОЛЖНОСТЬ     |");
        System.out.printf("|  %-5s| %-32s | %-32s|         %-11s |\n", carInParking.getNumber(), getCheckIn(), getCheckOut(), getSum());

    }

    public void parking(List<Car> cars) {
        for (Car car : cars) {
            checkParking(car);
        }
    }

    public int checkSum() {
        int checkTime = getCheckOut().getMinute() - getCheckIn().getMinute();
        int price = checkTime * 2;
        LocalTime checkHour = LocalTime.of(21, 00);
        LocalTime checkHour2 = LocalTime.of(9, 00);
        if (checkTime < 30 || getCheckIn().isAfter(ChronoLocalDateTime.from(checkHour)) || getCheckIn().isBefore(ChronoLocalDateTime.from(checkHour2))) {
            setSum(0);
        } else {
            setSum(price);
        }
        return getSum();
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public Car getCarInParking() {
        return carInParking;
    }

    public void setCarInParking(Car carInParking) {
        this.carInParking = carInParking;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

