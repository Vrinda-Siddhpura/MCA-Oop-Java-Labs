import java.util.Scanner;

class Student{
    String name;
    int roll_no;
    double spi;
    String course;

    public void setter(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter roll no.: ");
        this.roll_no = sc.nextInt();
        System.out.print("Enter spi: ");
        this.spi = sc.nextDouble();
        System.out.print("Enter course: ");
        this.course = sc.next();
    }

    public void getter(){
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+roll_no);
        System.out.println("Spi: "+spi);
        System.out.println("Course: "+course);
    }
}

public class P1{
    public static void main(String []args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setter();
        s2.setter();
        s3.setter();

        s1.getter();
        s2.getter();
        s3.getter();
    }
}