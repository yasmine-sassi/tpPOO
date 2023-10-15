
public class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;
    public Course(int id, String name,Instructor ins){
        courseId=id;
        courseName=name;
        instructor=ins;
    }
    public int getCourseId(){return this.courseId;}
    public String getCourseName(){return this.courseName;}
    public Instructor getInstructor(){return this.instructor;}
    public void affiche(){
        System.out.println("ID: "+courseId);
        System.out.println("CourseName: "+courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
