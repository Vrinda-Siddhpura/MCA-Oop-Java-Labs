import java.util.Scanner;

class AgeException extends Exception{
    AgeException(String msg) {
        super(msg);
    }
}

public class P3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if(age < 18){
                throw new AgeException("Age must be 18 or above!");
            }

            System.out.println("You are eligible.");

        } 
        catch(AgeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
