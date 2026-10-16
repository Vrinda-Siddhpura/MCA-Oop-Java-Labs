package Bank;

public class BankDemo{
    public static void main(String[] args){
        BankAccount b = new BankAccount();

        System.out.println(b.accountNumber);
        System.out.println(b.customerName);
        System.out.println(b.accountType);

        b.display();
    }
}