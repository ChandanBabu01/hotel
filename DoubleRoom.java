package hotel_inheritance;

public class DoubleRoom extends Room {
    public DoubleRoom(int roomNumber) {
        super(roomNumber, 3500);
    }

    @Override
    public String getType() {
        return "Double";
    }
}
