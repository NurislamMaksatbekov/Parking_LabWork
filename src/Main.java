import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        LocalDateTime ldt = LocalDateTime.now();
        int days = 1;
        City city = new City();
        Note note = new Note();
        int a = 0;
        for (LocalDateTime i = ldt; i.isBefore(ldt.plusDays(1)); i = i.plusMinutes(5)) {
            if (a == 288){
                System.out.println("");
                System.out.printf(" День %s\n", days);
                System.out.println("");
                days++;
//                a = 0;
            }else {
                note.parking(city.cars);
                note.printNote();
                a++;
                System.out.println("--------------------------------------------------------------------");
            }
        }
    }
}