abstract class Vehicle{
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle{
    public void startEngine(){
        System.out.println("Car engine started");
    }

    public void stopEngine(){
        System.out.println("Car engine stopped");
    }
}

class Motorcycle extends Vehicle{
    public void startEngine(){
        System.out.println("Motorcycle engine started");
    }

    public void stopEngine(){
        System.out.println("Motorcycle engine stopped");
    }
}

public class P3{
    public static void main(String []args){
        Car c = new Car();
        Motorcycle m = new Motorcycle();

        c.startEngine();
        c.stopEngine();
        m.startEngine();
        m.stopEngine();
    }
}