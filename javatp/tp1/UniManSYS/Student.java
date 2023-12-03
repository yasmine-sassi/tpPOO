
import java.util.ArrayList;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;
    public Student(int id,String name,String lname){
        studentId=id;
        firstName=name;
        lastName=lname;
        this.courses= new ArrayList<>();
    }
    public int getStudentId(){return this.studentId;}
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public void enroll(Course course) {
        courses.add(course);
    }
    public void affiche(){
        System.out.println("ID: "+studentId);
        System.out.println("FirstName: "+firstName);
        System.out.println("LastName: "+lastName);
        if (!courses.isEmpty()) {
            System.out.print("Enrolled Courses: ");
            for (int i = 0; i < courses.size(); i++) {
                Course course = courses.get(i);
                System.out.print("(Course ID: " + course.getCourseId() + ", Course Name: " + course.getCourseName() + ")");
                if (i < courses.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Enrolled Courses: None");
        }
    }
    
}

