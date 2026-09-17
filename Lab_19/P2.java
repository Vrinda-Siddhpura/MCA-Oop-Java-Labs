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