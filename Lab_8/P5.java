import java.util.Scanner;

public class P5{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman Digit: ");
        char c = Character.toUpperCase(sc.next().charAt(0));

        switch(c){
            case 'I':
                System.out.print("I = "+ 1);
                break;

            case 'V':
                System.out.print("V = "+ 5);
                break;
            
            case 'X':
                System.out.print("X = "+ 10);
                break;

            case 'L':
                System.out.print("L = "+ 50);
                break;

            case 'C':
                System.out.print("C = "+ 100);
                break;

            default:
                System.out.print("Invalid Input!!");
                break;
        }
    }
}