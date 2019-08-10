import java.util.*;

public class School
{
    private static List<Teachers> teachers;
    private static List<Students> students;
    private static String name, location;
    private static int yearFounded;
    
    public School()
    {
        List<Teachers> teachers = new ArrayList<Teachers>();
        List<Students> students = new ArrayList<Students>();
        
        name = "John Smith Middle School";
        location = "Vancouver, British Columbia, Canada";
        yearFounded = 1937;
    }
    public School(String name, String location, int yearFounded)
    {
        List<Teachers> teachers = new ArrayList<Teachers>();
        List<Students> students = new ArrayList<Students>();
        
        this.name = name;
        this.location = location;
        this.yearFounded = yearFounded;
    }
    
    public static void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }
    public static void addStudent(Students student) {
        students.add(student);
    }
    
    public static void removeTeacher(int index) {
        teachers.remove(index);
    }
    public static void removeStudent(int index) {
        students.remove(index);
    }
    
    public static List<Teachers> getTeachers() {
        return teachers;
    }
    public static List<Students> getStudents() {
        return students;
    }
}
