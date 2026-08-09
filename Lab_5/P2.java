import java.util.Scanner;

public class P2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st numeber: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd numeber: ");
        int b = sc.nextInt();

        System.out.print("Enter operator: ");
        char c = sc.next().charAt(0);

        if(c=='+'){
            System.out.print(""+(a+b));
        }
        else if(c=='-'){
            System.out.print(""+(a-b));
        }
        else if(c=='/'){
            System.out.print(""+(a/b));
        }
        else if(c=='*'){
            System.out.print(""+(a*b));
        }
        else if(c=='%'){
            System.out.print(""+(a%b));
        }
        else{
            System.out.print("Invalid Input!");
        }
    }
}