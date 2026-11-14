import java.util.LinkedList;

public class P2{
    public static void main(String[] args){
        LinkedList<Double> prices = new LinkedList<>();

        prices.add(250.50);
        prices.add(499.99);
        prices.add(120.00);
        prices.add(799.50);

        System.out.println("Product Prices:");
        for(double price : prices){
            System.out.println(price);
        }
    }
}