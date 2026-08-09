import java.util.Scanner;

public class P1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark1: ");
        int a = sc.nextInt();

        System.out.print("Enter Mark2: ");
        int b = sc.nextInt();

        System.out.print("Enter Mark3: ");
        int c = sc.nextInt();

        double res = (a+b+c)/3;

        System.out.print("Enter Annual Income: ");
        double income = sc.nextDouble();

        if(res>=75 && income<250000){
            System.out.print("Eligible.");
        }
        else{
            System.out.print("Not Eligible");
        }
    }
}