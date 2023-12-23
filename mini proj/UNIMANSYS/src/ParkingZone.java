public class ParkingZone {
    public String zoneId;
    private int capacity;
    private int availability;

    public ParkingZone(String zoneId, int capacity) {
        this.zoneId = zoneId;
        this.capacity = capacity;
        this.availability = capacity; 
    }

    public boolean reserveParkingSpot() {
        if (availability > 0) {
            availability--;
            return true;
        } else {
            System.out.println("No available parking spots in Zone " + zoneId);
            return false;
        }
    }

    public int getAvailability(){
        return availability;
    }

    public int getCapacity(){
        return capacity;
    }
}
