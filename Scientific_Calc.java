import static  java.lang.Math.PI;
import static  java.lang.Math.pow;
import static  java.lang.Math.sqrt;
import java.util.Scanner;

public class Scientific_Calc{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter radius of circle :");
        int r=sc.nextInt();

        System.out.println("Enter number to find square root:");
        int n=sc.nextInt();

        System.out.println("Enter exponent and power to calculate:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("Area of Circle : "+PI*r*r);
        System.out.println("Square root of "+n+"is : "+sqrt(n));
        System.out.println(n2+" th power of "+n1+"is : "+pow(n1,n2));
    }
}