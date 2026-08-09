import java.util.Scanner;

public class P3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        System.out.print("Area: "+(l*b));
    }
}