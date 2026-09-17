class Person{
    String name;

    Person(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Name: "+this.name);
    }
}

class Student extends Person{
    int rollno;

    Student(String name, int rollno){
        super(name);
        this.rollno = rollno;
    }

    public void displayStudent(){
        display();
        System.out.println("Roll No: "+this.rollno);
    }
}

public class P1{
    public static void main(String []args){
        Student s = new Student("Vrinda", 101);
        s.displayStudent();
    }
}