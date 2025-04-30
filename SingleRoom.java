package hotel_inheritance;

public class SingleRoom extends Room {
    public SingleRoom(int roomNumber) {
        super(roomNumber, 2000);
    }

    @Override
    public String getType() {
        return "Single";
    }
}
