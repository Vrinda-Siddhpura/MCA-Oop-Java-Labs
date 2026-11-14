import java.util.ArrayList;

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
        System.out.println("ID: " + StudentID);
        System.out.println("Name: " + StudentName);
        System.out.println("Roll No: " + StudentRollNo);
        System.out.println("SPI: " + StudentSPI);
        System.out.println();
    }
}

public class P3{
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Vrinda", 1, 9.2));
        students.add(new Student(102, "Rahul", 2, 8.5));
        students.add(new Student(103, "Amit", 3, 7.8));

        System.out.println("Student Details:");
        for(Student s : students){
            s.display();
        }
    }
}