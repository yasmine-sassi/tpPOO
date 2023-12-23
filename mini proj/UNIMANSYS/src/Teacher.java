import java.util.ArrayList;

public class Teacher implements Timetable {
    private String teacherId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> coursesTeaching;

    public Teacher(String teacherId, String firstName, String lastName) {
        this.teacherId = teacherId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.coursesTeaching = new ArrayList<>();
    }

    public void viewTimetable() {
        System.out.println("Teacher Timetable");
        for (Course course : coursesTeaching) {
            System.out.println(course.getCourseName() + " - " +"wakt");
        }
    }

    public void addToTimetable(Course course) {
        if (!coursesTeaching.contains(course)) {
            coursesTeaching.add(course);
            System.out.println("Added " + course.getCourseName() + " to teacher's timetable.");
        } else {
            System.out.println("Teacher is already teaching " + course.getCourseName() + ".");
        }
    }

    public void parkCar(ParkingZone ParkingZone) {
        if(ParkingZone.zoneId!="Teacher Zone"){
            System.out.println("Wrong parking zone, it's a "+ParkingZone.zoneId);
        }
        else{
            if (ParkingZone.reserveParkingSpot()) {
                System.out.println("Car parked in teacher parking zone");
            } else {
                System.out.println("Unable to park car");
            }
        }
    }
}
