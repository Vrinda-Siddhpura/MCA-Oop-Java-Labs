import java.util.Scanner;

public class P1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter meter: ");
        double m = sc.nextDouble();

        System.out.print(""+(m*3.28));
    }
}
