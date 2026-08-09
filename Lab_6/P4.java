import java.util.Scanner;

public class P4{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double b = sc.nextDouble();

        if(b>=5000){
            b -= b*0.2;
        }
        else if(b>=3000){
            b -= b*0.1;
        }

        double GST = b*0.05;
        b += GST;
        System.out.print("Total Bill: "+b);
    }
}