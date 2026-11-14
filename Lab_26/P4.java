import java.util.Scanner;

class RowSum extends Thread{
    int a[][];
    int row;
    int sum = 0;

    RowSum(int a[][], int row){
        this.a = a;
        this.row = row;
    }

    public void run(){
        for(int j=0 ; j<a[row].length ; j++){
            sum = sum + a[row][j];
        }

        System.out.println("Sum of Row " + (row + 1) + " = " + sum);
    }
}

public class P4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int a[][] = new int[m][n];

        System.out.println("Enter matrix elements:");

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                a[i][j] = sc.nextInt();
            }
        }

        RowSum t[] = new RowSum[m];

        for(int i=0 ; i<m ; i++){
            t[i] = new RowSum(a, i);
            t[i].start();
        }

        for(int i=0 ; i<m ; i++){
            try{
                t[i].join();
            } 
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
