import java.util.Scanner;

public class P3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units: ");
        int u = sc.nextInt();

        double res;
        if(u<=100){
            res = u*5;
        }
        else if(u<=200){
            res = 100*5 + (u-100)*7;
        }
        else{
            res = 100*5 + 100*7 + (u-200)*10;
        }

        System.out.print(""+res);
    }
}