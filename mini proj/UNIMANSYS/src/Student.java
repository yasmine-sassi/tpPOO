public class Student implements Timetable {
    private String studentId;
    private String firstName;
    private String lastName;
    private ClassSchedule classSchedule;

    public Student(String studentId, String firstName, String lastName, ClassSchedule classSchedule) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.classSchedule = classSchedule;
    }

    public void viewTimetable() {
        classSchedule.viewTimetable();
    }

    public void addToTimetable(Course course) {
        classSchedule.addToTimetable(course);
    }

    public void parkCar(ParkingZone ParkingZone) {
        if(ParkingZone.zoneId !="Student Zone"){
            System.out.println("Wrong parking zone, it's a "+ParkingZone.zoneId);
        }
        else{
            if (ParkingZone.reserveParkingSpot()) {
                System.out.println("Car parked in student parking zone");
            } else {
                System.out.println("Unable to park car");
            }
        }
    }

}
