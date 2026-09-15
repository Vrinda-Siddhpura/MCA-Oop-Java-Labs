class Employee{
    int id;
    String name;
    static String companyName = "abc";

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println();
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Company Name: "+companyName);
    }
}

public class P2{
    public static void main(String []args){
        Employee e1 = new Employee(101, "Vrinda");
        Employee e2 = new Employee(102, "Aastha");
        Employee e3 = new Employee(103, "Khushi");

        e1.display();
        e2.display();
        e3.display();
    }
}