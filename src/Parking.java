
public class Parking {
    private static Car car = new Car();
    private int freeSpace;

    public Parking() {
        this.freeSpace = 20;
    }

    public int getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = freeSpace;
    }
}
