import java.util.ArrayList;

public class ClassSchedule implements Timetable {
    private String grade;
    private ArrayList<Course> courses;

    public ClassSchedule(String grade) {
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void viewTimetable() {
        System.out.println("Timetable for Grade " + grade + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    public void addToTimetable(Course course) {
        courses.add(course);
    }

}