package hotel_inheritance;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public Hotel() {
        rooms.add(new SingleRoom(101));
        rooms.add(new DoubleRoom(102));
        rooms.add(new SuiteRoom(103));
    }

    public void showAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                room.showDetails();
            }
        }
    }

    public Room findRoom(String type) {
        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type) && room.isAvailable()) {
                return room;
            }
        }
        return null;
    }

    public void bookRoom(String customerName, String type) {
        Room room = findRoom(type);
        if (room != null) {
            Booking booking = new Booking(customerName, room);
            bookings.add(booking);
            System.out.println("Booking successful!");
            booking.displayBooking();
        } else {
            System.out.println("No available " + type + " rooms.");
        }
    }

    public void showAllBookings() {
        System.out.println("All Bookings:");
        for (Booking booking : bookings) {
            booking.displayBooking();
            System.out.println();
        }
    }
    
}
