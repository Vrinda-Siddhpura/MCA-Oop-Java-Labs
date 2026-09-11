class BankAccount{
    int accountNo;
    double balance;

    static String bankName;
    static double interestRate;

    BankAccount(int accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    static void setBankName(String name){
        bankName = name;
    }

    static String getBankName(){
        return bankName;
    }

    static void setInterestRate(double rate){
        interestRate = rate;
    }

    static double getInterestRate(){
        return interestRate;
    }

    void displayDetails(){
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + getBankName());
        System.out.println("Interest Rate: " + getInterestRate() + "%");
        System.out.println();
    }
}

public class P3{
    public static void main(String[] args){

        BankAccount.setBankName("SBI");
        BankAccount.setInterestRate(7.5);

        BankAccount a1 = new BankAccount(101, 50000);
        BankAccount a2 = new BankAccount(102, 75000);
        BankAccount a3 = new BankAccount(103, 100000);

        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();
    }
}