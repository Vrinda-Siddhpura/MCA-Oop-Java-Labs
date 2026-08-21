import java.util.Scanner;

class Cube{
    double height;
    double width;
    double depth;

    public void getter(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        this.height = sc.nextDouble();
        System.out.print("Enter width: ");
        this.width = sc.nextDouble();
        System.out.print("Enter depth: ");
        this.depth = sc.nextDouble();
    }

    public void setter(){
        System.out.println();
        System.out.println("Cube Details...");
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
        System.out.println("Depth: "+depth);
    }

    public void volumn(){
        double res = height*width*depth;
        System.out.println("Volumn: "+res);
    }
}

public class P2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        Cube c1 = new Cube();
        Cube c2 = new Cube();

        c1.getter();
        c2.getter();

        c1.setter();
        c1.volumn();

        c2.setter();
        c2.volumn();
    }
}