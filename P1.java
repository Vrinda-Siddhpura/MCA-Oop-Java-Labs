import java.util.Scanner;

class Time{
    int hour;
    int min;
    int sec;

    public void setter(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour: ");
        this.hour = sc.nextInt();
        System.out.print("Enter minutes: ");
        this.hour = sc.nextInt();
        System.out.print("Enter seconds: ");
        this.hour = sc.nextInt();
    }

    public void addTime(Time t2){
        int totalSec = this.sec + t2.sec;
        int totalMin = this.min + t2.min + totalSec/60;
        int totalHour = this.hour + t2.hour + totalMin/60;

        totalSec %= 60;
        totalMin %= 60;

        System.out.print("Total time: " + totalHour + " : " + totalMin + " : " + totalSec);
    }
}

public class P1{
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);

        Time t1 = new Time();
        Time t2 = new Time();

        System.out.println("Enter 1st time...");
        t1.setter();

        System.out.println("Enter 2nd time...");
        t2.setter();

        t1.addTime(t2);
    }
}