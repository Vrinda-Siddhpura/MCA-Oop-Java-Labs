public class P1 {
    public static void main(String[] args){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurred");
        }

        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception occurred");
        }
    }
}
