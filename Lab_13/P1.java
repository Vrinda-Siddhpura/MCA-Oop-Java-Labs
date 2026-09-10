import java.util.Scanner;

class Circle{
    double radius;

    public void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        this.radius = sc.nextDouble();
    }

    public void area(){
        double res = Math.PI*this.radius*this.radius;
        System.out.print("Area: "+res);
    }
}

public class P1{
    public static void main(String []args){
        Circle c = new Circle();
        
        c.getData();
        c.area();
    }
}
