class Hospital{
    public void display(){
        System.out.println("General hospital information...");
    }
}

class Department extends Hospital{
    public void display(){
        super.display();
        System.out.println("Eye care department");
    }
}

public class P4{
    public static void main(String []args){
        Department d = new Department();
        d.display();
    }
}