
public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;
    public Instructor(int id,String fnm,String lnm){
        instructorId=id;
        firstName=fnm;
        lastName=lnm;
    }
    public int getInstructorId(){return this.instructorId;}
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public void affiche(){
        System.out.println("ID: "+instructorId);
        System.out.println("FirstName: "+firstName);
        System.out.println("LastName: "+lastName);
    }
}
