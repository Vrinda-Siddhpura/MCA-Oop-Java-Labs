import java.util.Scanner;

public class P4{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size1: ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];
        System.out.print("Enter elements: ");
        for(int i=0 ; i<size1 ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size2: ");
        int size2 = sc.nextInt();

        int arr2[] = new int[size2];
        System.out.print("Enter elements: ");
        for(int i=0 ; i<size2 ; i++){
            arr2[i] = sc.nextInt();
        }

        int size3 = size1 + size2;
        int arr3[] = new int[size3];

        for(int i=0 ; i<size1 ; i++){
            arr3[i] = arr1[i];
        } 

        for(int i=0 ; i<size2 ; i++){
            arr3[size1+i] = arr2[i];
        }

        for(int i=0 ; i<size3 ; i++){
            System.out.print("" + arr3[i] + " ");
        }
    }
}