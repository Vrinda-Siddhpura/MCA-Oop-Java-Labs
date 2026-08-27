import java.util.Scanner;

public class P4{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size1: ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];
        System.out.print("Enter elements: ");
        for(int i=0 ; i<arr1.length ; i++){
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[size1];;
        for(int i=0 ; i<size1 ; i++){
            arr2[i] = arr1[i];
        }

        System.out.print("Original Array: ");
        for(int i=0 ; i<size1 ; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.print("\nCopied Array: ");
        for(int i=0 ; i<arr2.length ; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}