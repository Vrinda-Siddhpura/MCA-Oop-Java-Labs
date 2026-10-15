import java.util.Scanner;

class InSufficientFundException extends Exception{
    InSufficientFundException(String msg){
        super(msg);
    }
}

class Account{
    int accNo;
    double balance;

    Account(int accNo, double balance){
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        balance += amount;
        System.out.println("Balance: "+balance);
    }

    public void withdraw(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try{
            if(amount<=0 || amount>balance){
                throw new InSufficientFundException("Invalid Transaction!");
            }
            else{
                balance -= amount;
                System.out.println("Balnace: "+balance);
            }
        }
        catch(InSufficientFundException e){
            System.out.println(e.getMessage());
        }
    }
}

public class P1{
    public static void main(String []args){
        Account a = new Account(101, 5000);
        a.deposit();
        a.withdraw();
    }
}
