import java.util.Scanner;

class Student{
    String name;
    int mark;

    public void setData(){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter Details...");
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Mark: ");
        this.mark = sc.nextInt();
    }

    public void getData(){
        System.out.println();
        System.out.println("Name: "+this.name);
        System.out.println("Mark: "+this.mark);
    }
}

public class P4{
    public static void main(String []args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setData();
        s2.setData();

        if(s1.mark>s2.mark){
            s1.getData();
        }
        else{
            s2.getData();
        }
    }
}
