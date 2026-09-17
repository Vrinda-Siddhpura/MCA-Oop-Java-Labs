// Write a Java program for a Hospital Management System where different departments 
// such as Cardiology, Neurology, and Orthopedics override  a common displayServices() 
// method. Use a parent class reference to dynamically call department-specific methods 
// at runtime. 
class Hospital{
    public void display(){
        System.out.println("Hospital Information...");
    }
}

class Cardiology extends Hospital{
    public void display(){
        System.out.println("Cardiolody Department");
    }
}

class Neurology extends Hospital{
    public void display(){
        System.out.println("Neurology Department");
    }
}

class Orthopedics extends Hospital{
    public void display(){
        System.out.println("Orthopedics Department");
    }
}

public class P2{
    public static void main(String []args){
        Hospital h;

        h = new Hospital();
        h.display();

        h = new Cardiology();
        h.display();

        h = new Neurology();
        h.display();

        h = new Orthopedics();
        h.display();
    }
}