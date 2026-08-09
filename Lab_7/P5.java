import java.util.Scanner;

public class P5{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Shape to calculate area: ");
        String shape = sc.nextLine().toLowerCase();

        switch(shape){
            case "circle":
                System.out.print("Enter Radius: ");
                double radius = sc.nextDouble();

                double cArea = Math.PI*radius*radius;
                System.out.print("Area: "+cArea);
                break;

            case "rectangle":
                System.out.print("Enter Length: ");
                double length = sc.nextDouble();

                System.out.print("Enter Breadth: ");
                double breadth = sc.nextDouble();

                double rArea = length*breadth;
                System.out.print("Area: "+rArea);
                break;

            case "triangle":
                System.out.print("Enter base: ");
                double base = sc.nextDouble();

                System.out.print("Enter Height: ");
                double height = sc.nextDouble();

                double tArea = 0.5*base*height;
                System.out.print("Area: "+tArea);
                break;
            
            case "square":
                System.out.print("Enter Length: ");
                double l = sc.nextDouble();

                double sArea = l*l;
                System.out.print("Area: "+sArea);
                break;

            default:
                System.out.print("Invalid Input!!");
                break;
        }
    }
}