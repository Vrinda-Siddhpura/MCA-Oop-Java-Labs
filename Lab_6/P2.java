import java.util.Scanner;

public class P2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if((n & 1) == 0){
            System.out.print("Even.");
        }
        else{
            System.out.print("Odd.");
        }
    }
}