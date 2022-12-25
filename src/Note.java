import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;
public class Note {
    private static Random rnd = new Random();

    private static LocalTime  checkIn;
    private static LocalTime checkOut;
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
                checkOut = LocalTime.now();
            }
        }else{
            if(rndNum <= 3){
                car.setState(false);
                checkIn = LocalTime.now();
                carInParking = car;
            }
        }
    }

    public static void printNote(){
        System.out.println("| НОМЕР |        ВРЕМЯ ЗАЕЗДА           |         ВРЕМЯ ВЫЕЗДА         |     ЗАДОЛЖНОСТЬ     |");
        System.out.printf("|  %-5s|        %-23s|       %-23s|          %-11s|\n", carInParking.getNumber(), checkIn, checkOut, sum);
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
        if(checkTime < 30 || checkIn.isAfter(LocalTime.of(21, 00)) || checkIn.isBefore(LocalTime.of(9, 00))) {
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

    public static LocalTime getCheckIn() {
        return checkIn;
    }

    public static void setCheckIn(LocalTime checkIn) {
        Note.checkIn = checkIn;
    }

    public static LocalTime getCheckOut() {
        return checkOut;
    }

    public static void setCheckOut(LocalTime checkOut) {
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

