import java.util.Scanner;

public class P2{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter 1st number: ");
            int num1 = Integer.parseInt(sc.next());

            System.out.print("Enter 2nd number: ");
            int num2 = Integer.parseInt(sc.next());

            double res = num1/num2;
            System.out.println("Result: "+res);
        }
        catch(NumberFormatException e){
            System.out.print("Please enter valid integers");
        }
        catch(ArithmeticException e){
            System.out.print("Cannot divide by zero");
        }
    }
}