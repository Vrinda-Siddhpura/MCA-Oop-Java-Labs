class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}

class Student extends Person{
    int rollNo;

    Student(String name, int age, int rollNo){
        super(name, age);
        this.rollNo = rollNo;
    }

    public void displayStudent(){
        display();
        System.out.println("Roll No: "+this.rollNo);
    }
}

class Faculty extends Person{
    double salary;

    Faculty(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public void displayFaculty(){
        display();
        System.out.println("Salary: "+this.salary);
    }
}

public class P3{
    public static void main(String []args){
        Student s = new Student("Vrinda", 20, 101);
        Faculty f = new Faculty("Abc sir", 40, 35000);

        s.displayStudent();
        System.out.println();
        f.displayFaculty();
    }
}