
public class Student
{
    private String firstName, lastName;
    int grade, id = getId();

    /**
     * Constructor for objects of class Students
     */
    public Student()
    {
        firstName = "Mia";
        lastName = "Fitzgerald";
        id = id + 1; setId(id);
        grade = 7;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }
    public int getGrade() {
        return grade;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setId(int Id) {
        this.id = id;
    }
    public void getGrade(int Grade) {
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        String identifier = "Name: " + firstName + " " + lastName + " " + "Grade: " + grade;
        return identifier;
    }
}
