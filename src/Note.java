import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class Note {
    private static Random rnd = new Random();

    private static LocalDateTime  checkIn;
    private static LocalDateTime checkOut;
    private static Car carInParking;
    private double sum;

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
        System.out.println("| НОМЕР |      ВРЕМЯ ЗАЕЗДА           |       ВРЕМЯ ВЫЕЗДА          |");
        System.out.printf("|  %-5s|%-10s|%-10s|\n", carInParking.getNumber(), checkIn, checkOut);
        System.out.println("---------------------------------------------------------------------");
    }

    public static  void parking (List<Car> cars){
        for(Car car : cars){
            checkParking(car);
        }
    }

//    public void print(List<Car> car){
//        Car cars = new Car();
//        Parking parking = new Parking();
//        System.out.println("|       Номер       |     Состояние     |     Время заезда      |     Время выезда     |     Цена     |\n" +
//                           "|___________________|___________________|_______________________|______________________|______________|");
//        for (int i = 0; i < 200; i++) {
//            System.out.printf("| %-10s| %-10s| %-10s| %-10s| %10-s|",cars.getNumber(), cars.isState(),cars.getTime(), cars.getTimeOfLeave(), parking.getPrice());
//        }

}
