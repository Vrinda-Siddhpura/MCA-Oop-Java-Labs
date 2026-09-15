import java.util.Scanner;

class Area{
    static final double PI=3.14159;
    double radius;

    public void setData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        this.radius = sc.nextDouble();
    }

    public void area(){
        double A = PI*radius*radius;

        System.out.print("Area: "+A);
    }
}

public class P1{
    public static void main(String []args){
        Area a = new Area();
        a.setData();
        a.area();
    }
}