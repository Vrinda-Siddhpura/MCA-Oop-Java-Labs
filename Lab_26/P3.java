import java.util.Random;

class NumberGenerator extends Thread{

    public void run(){
        Random r = new Random();

        for(int i=1 ; i<=5 ; i++){
            int n = r.nextInt(100);

            System.out.println("Generated Number: " + n);

            if(n%2==0){
                SquareThread s = new SquareThread(n);
                s.start();
            } 
            else{
                CubeThread c = new CubeThread(n);
                c.start();
            }

            try{
                Thread.sleep(1000);
            } 
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class SquareThread extends Thread{
    int n;

    SquareThread(int n){
        this.n = n;
    }

    public void run(){
        System.out.println("Square: " + (n * n));
    }
}

class CubeThread extends Thread{
    int n;

    CubeThread(int n){
        this.n = n;
    }

    public void run(){
        System.out.println("Cube: " + (n * n * n));
    }
}

public class P3{
    public static void main(String[] args){
        NumberGenerator t = new NumberGenerator();
        t.start();
    }
}
