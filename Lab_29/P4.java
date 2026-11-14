import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int StudentID;
    String StudentName;
    int StudentRollNo;
    double StudentSPI;

    Student(int id, String name, int rollNo, double spi){
        StudentID = id;
        StudentName = name;
        StudentRollNo = rollNo;
        StudentSPI = spi;
    }

    void display(){
        System.out.println(StudentName + " - SPI: " + StudentSPI);
    }
}

public class P4{
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Vrinda", 1, 9.2));
        students.add(new Student(102, "Rahul", 2, 8.5));
        students.add(new Student(103, "Amit", 3, 7.8));

        Collections.sort(students, new Comparator<Student>(){
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.StudentSPI, s1.StudentSPI);
            }
        });

        System.out.println("Students sorted by SPI:");

        for(Student s : students){
            s.display();
        }
    }
}
