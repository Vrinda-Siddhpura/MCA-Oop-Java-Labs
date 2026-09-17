class Payment{
    public void processPayment(){
        System.out.println("Processing Payment...");
    }
}

class CreditCard extends Payment{
    public void processPayment(){
        System.out.println("Payment done by credit card");
    }
}

class UPI extends Payment{
    public void processPayment(){
        System.out.println("Payment done by UPI");
    }
}

class NetBanking extends Payment{
    public void processPayment(){
        System.out.println("Payment done by net banking");
    }
}

public class P2{
    public static void main(String []args){
        Payment p;

        p = new Payment();
        p.processPayment();

        p = new CreditCard();
        p.processPayment();

        p = new UPI();
        p.processPayment();

        p = new NetBanking();
        p.processPayment();
    }
}