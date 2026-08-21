import java.util.Scanner;

class Student{
    int mark;

    Student(int mark){
        if(mark<=0 || mark>100){
            System.out.print("Invalid Mark!!");
        }
        else{
            this.mark = mark;
        }
    }

    public void checkEligible(){
        if(this.mark>=60){
            System.out.print("You are eligible for placement.");
        }
        else{
            System.out.print("You are not eligible for placement.");
        }
    }
}

public class P1{
    public static void main(String []args){
        Student s1 = new Student(75);

        s1.checkEligible();
    }
}