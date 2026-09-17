class Account{
    int accNo;
    double balance;

    Account(int accNo, double balance){
        this.accNo = accNo;
        this.balance = balance;
    }

    public void display(){
        System.out.println("Account No: "+this.accNo);
        System.out.println("Balance: "+this.balance);
    }
}

class SavingsAccount extends Account{
    double interestRate;

    SavingsAccount(int accNo, double balance, double interestRate){
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccount(){
        display();
        System.out.println("Interest Rate: "+this.interestRate);
    }
}

class LoanAccount extends SavingsAccount{
    double loanAmount;

    LoanAccount(int accNo, double balance, double interestRate, double loanAmount){
        super(accNo, balance, interestRate);
        this.loanAmount = loanAmount;
    }

    public void displayLoanAccount(){
        displaySavingsAccount();
        System.out.println("Loan Amount: "+this.loanAmount);
    }
}

public class P4{
    public static void main(String []args){
        LoanAccount l = new LoanAccount(101, 10000.0, 2.0, 20000.0);
        l.displayLoanAccount();
    }
}