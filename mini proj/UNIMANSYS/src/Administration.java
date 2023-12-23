public class Administration {
    private String adminId;
    private String firstName;
    private String lastName;
    private String duties;

    public Administration(String adminId, String firstName, String lastName, String duties) {
        this.adminId = adminId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.duties = duties;
    }

    public void parkCar(ParkingZone ParkingZone) {
        if(ParkingZone.zoneId !="Administration Zone"){
            System.out.println("Wrong parking zone, it's a "+ParkingZone.zoneId);
        }
        else{
            if (ParkingZone.reserveParkingSpot()) {
                System.out.println("Car parked in administration parking zone");
            } else {
                System.out.println("Unable to park car");
            }
        }
    }
}
