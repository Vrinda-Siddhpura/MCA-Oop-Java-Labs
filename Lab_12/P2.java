import java.util.Scanner;

class Employee{
    String name;
    String jobTitle;
    double salary;

    public void setter(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter job title: ");
        this.jobTitle = sc.nextLine();
        System.out.print("Enter salary: ");
        this.salary = sc.nextDouble();
    }

    public void annualSalary(){
        double annualSalary = this.salary*12;
        System.out.println("Annual Salary: " + annualSalary);
    }

    public void updateSalary(){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter new salary: ");
        double newSalary = sc.nextDouble();
        this.salary = newSalary;
        System.out.println("Salary updated successfully.");
    }

    public void getter(){
        System.out.println();
        System.out.println("Name: "+this.name);
        System.out.println("Job Title: "+this.jobTitle);
        System.out.println("Salary: "+this.salary);
    }
}

public class P2{
    public static void main(String []args){
        Employee e = new Employee();

        e.setter();
        e.getter();
        e.annualSalary();
        e.updateSalary();
        e.getter();
    }
}