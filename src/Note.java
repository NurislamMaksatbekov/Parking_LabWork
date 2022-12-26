import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.List;
import java.util.Random;
public class Note {
    private static Random rnd = new Random();

    private static LocalDateTime checkIn;
    private static LocalDateTime checkOut;
    private static Car carInParking;
    private static int sum;

    public Note() {
        this.sum = checkSum();
    }

    public static void checkParking(Car car){
        int rndNum = rnd.nextInt(100) + 1;
        if(!car.isState()){
            if(rndNum <= 3) {
                car.setState(true);
                checkOut = LocalDateTime.now();
            }
        }else{
            if(rndNum <= 3){
                car.setState(false);
                checkIn = LocalDateTime.now();
                carInParking = car;
            }
        }
    }

    public static void printNote(){
        System.out.println("| НОМЕР |        ВРЕМЯ ЗАЕЗДА           |         ВРЕМЯ ВЫЕЗДА         |     ЗАДОЛЖНОСТЬ     |");
        System.out.printf("|  %-5s|   %-28s|  %-28s|          %-11s|\n", carInParking.getNumber(), checkIn, checkOut, sum);
        System.out.println("+--------------------------------------------------------------------------------------------+");
    }

    public static  void parking (List<Car> cars){
        for(Car car : cars){
            checkParking(car);
        }
    }
    public int checkSum(){
        int checkTime = checkOut.getMinute() - checkIn.getMinute();
        int price = checkTime * 2;
        LocalTime checkHour = LocalTime.of(21, 00);
        LocalTime checkHour2 = LocalTime.of(9, 00);
        if(checkTime < 30 || checkIn.isAfter(ChronoLocalDateTime.from(checkHour)) ||checkIn.isBefore(ChronoLocalDateTime.from(checkHour2))) {
            sum = 0;
        }else{
            sum = price;
        }
        return sum;
    }

    public static Random getRnd() {
        return rnd;
    }

    public static void setRnd(Random rnd) {
        Note.rnd = rnd;
    }

    public static LocalDateTime getCheckIn() {
        return checkIn;
    }

    public static void setCheckIn(LocalDateTime checkIn) {
        Note.checkIn = checkIn;
    }

    public static LocalDateTime getCheckOut() {
        return checkOut;
    }

    public static void setCheckOut(LocalDateTime checkOut) {
        Note.checkOut = checkOut;
    }

    public static Car getCarInParking() {
        return carInParking;
    }

    public static void setCarInParking(Car carInParking) {
        Note.carInParking = carInParking;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

