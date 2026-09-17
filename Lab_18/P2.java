abstract class BankAccount{
    double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    public abstract void deposit();
    public abstract void withdraw();
}

class SavingsAccount extends BankAccount{
    double amount;

    SavingsAccount(double balance, double amount){
        super(balance);
        this.amount = amount;
    }

    public void deposit(){
        balance += this.amount;
        System.out.println("Balance of saving account: "+balance);
    }

    public void withdraw(){
        if(this.amount<=0 || this.amount>balance){
            System.out.println("Invalid Transaction!");
            return;
        }
        else{
            balance -= this.amount;
            System.out.println("Balance of saving account: "+balance);
        }
    }
}

class CurrentAccount extends BankAccount{
    double amount;

    CurrentAccount(double balance, double amount){
        super(balance);
        this.amount = amount;
    }

    public void deposit(){
        balance += this.amount;
        System.out.println("Balance of current account: "+balance);
    }

    public void withdraw(){
        if(this.amount<=0 || this.amount>balance){
            System.out.println("Invalid Transaction!");
            return;
        }
        else{
            balance -= this.amount;
            System.out.println("Balance of current account: "+balance);
        }
    }
}

public class P2{
    public static void main(String []args){
        SavingsAccount s1 = new SavingsAccount(10000, 5000);
        s1.deposit();

        SavingsAccount s2 = new SavingsAccount(15000, 1000);
        s2.withdraw();

        CurrentAccount c1 = new CurrentAccount(20000, 5000);
        c1.deposit();

        CurrentAccount c2 = new CurrentAccount(25000, 1000);
        c2.withdraw();
    }
}