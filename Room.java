package hotel_inheritance;

public class Room {
    protected int roomNumber;
    protected boolean isAvailable;
    protected double price;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return "General Room";
    }

    public void showDetails() {
        System.out.println("Room " + roomNumber + " - " + getType() + " - ₹" + price + " - " + (isAvailable ? "Available" : "Booked"));
    }
}
