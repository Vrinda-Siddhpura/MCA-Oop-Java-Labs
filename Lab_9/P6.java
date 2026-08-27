import java.util.Scanner;
import java.util.Arrays;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements: ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int unique = 0;
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i]!=arr[i+1]){
                unique++;
            }
        }

        for(int i=0 ; i<arr.length ; i++){
            int count = 0;
            for(int j=0 ; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>=unique){
                System.out.print(arr[i] + " ");
            }

            while(i+1<arr.length && arr[i]==arr[i+1]){
                i++;
            }
        }
    }
}