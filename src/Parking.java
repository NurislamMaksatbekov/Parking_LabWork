import java.util.List;

public class Parking {
    private int freeSpace;
    private List<Note> notes;


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
