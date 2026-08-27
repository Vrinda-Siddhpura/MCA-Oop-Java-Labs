import java.util.Scanner;

class Array{
    int size;
    int arr[];

    Array(int size, int arr[]){
        this.size = size;
        this.arr = arr;
    }

    public void sortArray(){
        for(int i=0 ; i<size ; i++){
            for(int j=i+1 ; j<size ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0 ; i<size ; i++){
            System.out.print("" + arr[i] + " ");
        }
        System.out.println();
    } 

    public void searchArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int n = sc.nextInt();

        int found = 0;
        for(int i=0 ; i<size ; i++){
            if(arr[i]==n){
                found = 1;
                System.out.println("Index: "+i);
            }
        }

        if(found==0){
            System.out.println("Element is not present.");
        }
    }

    public void sumArray(){
        int sum = 0;

        for(int i=0 ; i<size ; i++){
            sum += arr[i];
        }

        System.out.println("Sum: "+sum);
    }

    public void avgArray(){
        int sum = 0;

        for(int i=0 ; i<size ; i++){
            sum += arr[i];
        }

        double avg = sum/size;
        System.out.println("Avg: "+avg);
    }
}

public class P5{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter elements: ");
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        Array a1 = new Array(size, arr);
        a1.sortArray();
        a1.searchArray();
        a1.sumArray();
        a1.avgArray();
    }
}