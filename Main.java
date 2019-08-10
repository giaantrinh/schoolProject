

public class Main {
    public static void main(String[] args) {
        School middleSchool = new School();
        
        for(int i = 0; i < 10; i ++) {
            middleSchool.addStudent(new Students());
        }
        System.out.println(middleSchool.getStudents());
        
        for(int j = 0; j < 3; j ++) {
            middleSchool.addTeacher(new Teachers());
        }
        System.out.println(middleSchool.getTeachers());
        
        middleSchool.removeStudent(0);
        middleSchool.removeStudent(1);
        System.out.println(middleSchool.getStudents());
        
        middleSchool.removeTeacher(0);
        System.out.println(middleSchool.getTeachers());
    }
}