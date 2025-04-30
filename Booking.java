package hotel_inheritance;

public class Booking {
    private String customerName;
    private Room room;

    public Booking(String customerName, Room room) {
        this.customerName = customerName;
        this.room = room;
        room.setAvailable(false);
    }

    public void displayBooking() {
        System.out.println("Booking Details:");
        System.out.println("Customer: " + customerName);
        System.out.println("Room No: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getType());
        System.out.println("Price: ₹" + room.getPrice());
    }
}
