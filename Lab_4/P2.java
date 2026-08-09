import java.util.Scanner;

public class P2{
    public static int fibonacci(int a){
        if(a<=0){
            return 0;
        }
        if(a==1){
            return 1;
        }

        return fibonacci(a-1) + fibonacci(a-2);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        for(int i=0; i<a; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}