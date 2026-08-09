import java.util.Scanner;

public class P4{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        while(true){
            System.out.println("Enter 1 to Deposit.");
            System.out.println("Enter 2 to Withdraw.");
            System.out.println("Enter 3 to Check balance.");
            System.out.println("Enter 4 to exit program.");
            System.out.print("Enter choice: ");
            int n = sc.nextInt();

            if(n==1){
                System.out.print("Enter value to Deposit: ");
                double deposit = sc.nextDouble();

                balance += deposit;
            }
            else if(n==2){
                System.out.print("Enter value to withdraw: ");
                double withdraw = sc.nextDouble();

                if(withdraw<=0 || withdraw>balance){
                    System.out.println("Invalid Value!!");
                    continue;
                }
            
                balance -= withdraw;
            }
            else if(n==3){
                System.out.println("Balance: "+balance);
            }
            else if(n==4){
                break;
            }
            else{
                System.out.println("Invalid Input!!");
            }
        }
    }
}