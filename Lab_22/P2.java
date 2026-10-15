class InSufficientFundException extends Exception{
    InSufficientFundException(String msg) {
        super(msg);
    }
}

class Account{
    double balance;
    double minBalance = 1000;

    Account(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount){
        try{
            if(balance-amount < minBalance){
                throw new InSufficientFundException("Insufficient balance! Minimum balance of 1000 must be maintained.");
            } 
            else{
                balance = balance-amount;
                System.out.println("Amount withdrawn: " + amount);
            }
        } 
        catch(InSufficientFundException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void display(){
        System.out.println("Current Balance: " + balance);
    }
}

public class P2{
    public static void main(String[] args){
        Account a = new Account(5000);

        a.deposit(1000);
        a.withdraw(5500);
        a.display();
    }
}
