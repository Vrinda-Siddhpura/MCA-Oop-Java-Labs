import java.util.Scanner;

public class P4{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Letter: ");
        char ch = sc.next().charAt(0);
        char c = Character.toLowerCase(ch);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.print("Vowel.");
        }
        else{
            System.out.print("Consonant.");
        }
    }
}