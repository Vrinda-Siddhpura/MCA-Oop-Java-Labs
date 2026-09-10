import java.util.Scanner;

public class P2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes: ");
        int m = sc.nextInt();

        double hourAngle = (h*30) + m*0.5;
        double minAngle = m*6;

        double angle = Math.abs(hourAngle - minAngle);

        if(angle>180){
            angle = 360 - angle;
        }

        System.out.print("Angle: "+angle);
    }
}