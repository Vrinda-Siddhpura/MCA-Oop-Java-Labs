class Thread1 implements Runnable{
    public void run(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("Thread 1: "+i);
        }
    }
}

public class P1ii{
    public static void main(String []args){
        Thread1 t = new Thread1();
        Thread t1 = new Thread(t);
        t1.start();
    }
}