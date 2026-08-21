import java.util.Scanner;

class BankDemo{
    int accNum;
    String accType;
    double balance;

    public void getter(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        this.accNum = sc.nextInt();
        System.out.print("Enter account type: ");
        this.accType = sc.next();
        System.out.print("Enter account balance: ");
        this.balance = sc.nextDouble();
    }

    public void setter(){
        System.out.println();
        System.out.println("Account Details...");
        System.out.println("Account number: "+accNum);
        System.out.println("Account type: "+accType);
        System.out.println("Balance: "+balance);
    }
}

public class P3{
    public static void main(String []args){
        BankDemo b1 = new BankDemo();
        BankDemo b2 = new BankDemo();
        BankDemo b3 = new BankDemo();

        b1.getter();
        b2.getter();
        b3.getter();

        b1.setter();
        b2.setter();
        b3.setter();
    }
}