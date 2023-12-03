
public class TestUni {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(1, "Fatma", "Sfaxi");
        Instructor instructor1=new Instructor(2,"Sana","Hamdi");
        Course course1 = new Course(101, "Mathematics", instructor);
        Course course2 = new Course(102, "Statistics", instructor);
        Course course3 = new Course(103,"OOP",instructor1);
        Student student1 = new Student(1001, "Yasmine", "Sassi");
        Student student2 = new Student(1002, "Tarek", "Gritli");
        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course2);
        student2.enroll(course3);
        System.out.println("Student 1 Information:");
        student1.affiche();
        System.out.println();
        System.out.println("Student 2 Information:");
        student2.affiche();
        System.out.println();
        System.out.println("Course 1 Information:");
        course1.affiche();
        System.out.println();
        System.out.println("Course 2 Information:");
        course2.affiche();
        System.out.println();
        System.out.println("Course 3 Information:");
        course3.affiche();
    }
}
