import java.util.*;

public class Teachers
{
    private String firstName, lastName, subject;
    
    public Teachers() {
        firstName = "Hilda";
        lastName = "Star";
        subject = "English";
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String subject() {
        return subject;
    }
    
    public void setFirstName(String firstName) {
        this.firstName =  firstName;
    }
    public void setLastName(String lastName) {
        this.lastName =  lastName;
    }
    public void setSubject(String subject) {
        this.subject =  subject;
    }
    
    @Override
    public String toString() {
        String identifier = "Name: " + firstName + " " + lastName + " " + "Subject: " + subject;
        return identifier;
    }
}
