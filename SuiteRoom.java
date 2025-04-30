package hotel_inheritance;

public class SuiteRoom extends Room {
    public SuiteRoom(int roomNumber) {
        super(roomNumber, 5000);
    }

    @Override
    public String getType() {
        return "Suite";
    }
}
