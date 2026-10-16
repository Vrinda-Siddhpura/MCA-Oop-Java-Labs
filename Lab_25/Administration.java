package Administration;

import University.Faculty;
import University.Student;

public class Administration{
    public static void main(String[] args){
        Student s = new Student();
        s.GetStudentInfo();

        Faculty f = new Faculty();
        f.GetFacultyInfo();
    }
}