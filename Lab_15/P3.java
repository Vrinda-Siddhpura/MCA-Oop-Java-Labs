import java.util.Scanner;

class House{
    private String address;
    private int numberOfRooms;
    private double area;

    public void setData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter address: ");
        this.address = sc.nextLine();
        System.out.print("Enter number of rooms: ");
        this.numberOfRooms = sc.nextInt();
        System.out.print("Enter area: ");
        this.area = sc.nextDouble();
    }

    public void calculatePrice(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price per square meter: ");
        double price = sc.nextDouble();

        double res = price*area;
        System.out.print("Total amount of house: "+res);
    }

    public void getData(){
        System.out.println();
        System.out.println("House Details...");
        System.out.println("Address: "+this.address);
        System.out.println("Number of rooms: "+this.numberOfRooms);
    }
}

public class P3{
    public static void main(String []args){
        House h = new House();

        h.setData();
        h.getData();
        h.calculatePrice();
    }
}
