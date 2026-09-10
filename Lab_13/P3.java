import java.util.Scanner;

class VowelCount{
    int a = 0;
    int e = 0;
    int i = 0;
    int o = 0;
    int u = 0;

    void countVowels(String str){
        a = 0;
        e = 0;
        i = 0;
        o = 0;
        u = 0;

        for(int j = 0; j < str.length(); j++){
            char ch = str.charAt(j);

            if(ch == 'a' || ch == 'A'){
                a++;
            }
            else if(ch == 'e' || ch == 'E'){
                e++;
            }
            else if(ch == 'i' || ch == 'I'){
                i++;
            }
            else if(ch == 'o' || ch == 'O'){
                o++;
            }
            else if(ch == 'u' || ch == 'U'){
                u++;
            }
        }
    }

    void display(){
        System.out.println("A = " + a);
        System.out.println("E = " + e);
        System.out.println("I = " + i);
        System.out.println("O = " + o);
        System.out.println("U = " + u);
    }
}

public class P3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        VowelCount obj = new VowelCount();

        while(true){
            System.out.print("Enter a sentence: ");
            String str = sc.nextLine();

            if(str.equalsIgnoreCase("quit")){
                break;
            }

            obj.countVowels(str);

            System.out.println("\nTotal count of each vowel:");
            obj.display();
        }
    }
}