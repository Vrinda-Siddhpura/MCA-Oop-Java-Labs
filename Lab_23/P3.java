import java.util.Scanner;

class OutOfRangeException extends Exception{
    OutOfRangeException(String msg){
        super(msg);
    }
}

public class P3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter nunber: ");
            int n = sc.nextInt();

            if(n<10 || n>50){
                throw new OutOfRangeException("Number out of range!");
            }
            else{
                System.out.print("Result: "+(n*n));
            }
        }
        catch(OutOfRangeException e){
            System.out.println(e.getMessage());
        }
    }
}