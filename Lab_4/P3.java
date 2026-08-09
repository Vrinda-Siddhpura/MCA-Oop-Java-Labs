import java.util.Scanner;

public class P3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;
        while(temp!=0){
            count++;
            temp /= 10;
        }

        int sum = 0;
        temp = n;
        while(temp!=0){
            int rem = temp %10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }

        if(sum==n){
            System.out.print("Armstrong number.");
        }
        else{
            System.out.print("Not Armstrong number.");
        }
    }
}