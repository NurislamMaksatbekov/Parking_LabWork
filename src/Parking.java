import java.util.List;

public class Parking {
    public void parkingFill(List<Car> cars, List<Car> parkingPlace){
        for (Car car : cars) {
            if (!car.isState() && parkingPlace.size() < 20){
                parkingPlace.add(car);
            }else if(parkingPlace.size() > 20){
                System.out.println("На парковке нет мест");
            }
        }
    }

}
