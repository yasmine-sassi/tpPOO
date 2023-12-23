public class App {
    public static void main(String[] args) {
        ParkingZone studentParkingZone = new ParkingZone("Student Zone", 150);
        ParkingZone teacherParkingZone = new ParkingZone("Teacher Zone", 60);
        ParkingZone adminParkingZone = new ParkingZone("Administration Zone", 20);

        ClassSchedule classSchedule1 = new ClassSchedule("GL2-1");
        ClassSchedule classSchedule2 = new ClassSchedule("GL2-2");

        Course mathCourse = new Course("Math");
        Course POOCourse = new Course("POO");

        classSchedule1.addToTimetable(mathCourse);
        classSchedule2.addToTimetable(POOCourse);

        Student student1 = new Student("S001", "John", "Doe", classSchedule1);
        Student student2 = new Student("S002", "Jane", "Smith", classSchedule2);
        Teacher teacher1 = new Teacher("T001", "Prof", "Johnson");
        Teacher teacher2 = new Teacher("T002", "Dr", "Smith");
        Administration admin1 = new Administration("A001", "Admin", "Adminson", "Manager");

        System.out.println("Student 1 Timetable:");
        student1.viewTimetable();
        System.out.println();

        System.out.println("Teacher 1 Timetable:");
        teacher1.viewTimetable();
        System.out.println();

        student1.parkCar(studentParkingZone);
        student2.parkCar(teacherParkingZone);
        teacher1.parkCar(teacherParkingZone);
        teacher2.parkCar(studentParkingZone);
        admin1.parkCar(adminParkingZone);

        System.out.println("\nRemaining Parking Availability:");
        System.out.println("Student Parking Zone: " + studentParkingZone.getAvailability());
        System.out.println("Teacher Parking Zone: " + teacherParkingZone.getAvailability());
        System.out.println("Admin Parking Zone: " + adminParkingZone.getAvailability());
    }
}
