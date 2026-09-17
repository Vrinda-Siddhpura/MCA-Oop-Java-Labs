class Vehicle{
    public void display(){
        System.out.println("Vehicle Information...");
    }
}

class Car extends Vehicle{
    public void display(){
        System.out.println("Car");
    }
}

class Bike extends Vehicle{
    public void display(){
        System.out.println("Bike");
    }
}

class Bus extends Vehicle{
    public void display(){
        System.out.println("Bus");
    }
}

public class P1{
    public static void main(String []args){
        Vehicle v;

        v = new Vehicle();
        v.display();

        v = new Car();
        v.display();

        v = new Bike();
        v.display();

        v = new Bus();
        v.display();
    }
}
