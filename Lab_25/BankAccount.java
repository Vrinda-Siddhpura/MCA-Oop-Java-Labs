package Bank;

public class BankAccount{

    public int accountNumber = 1001;
    protected String customerName = "Vrinda Siddhpura";
    String accountType = "Saving";
    private double balance = 50000;

    public void display(){
        System.out.println(accountNumber);
        System.out.println(customerName);
        System.out.println(accountType);
        System.out.println("Balance: " + balance);
    }
}