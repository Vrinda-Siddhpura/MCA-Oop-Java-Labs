interface A{
    int a = 10;

    public void displayA();
}

interface A1 extends A{
    int b = 20;

    public void displayA1();    
}

interface A2 extends A{
    int c = 30;

    public void displayA2();
}

interface A12 extends A1, A2{
    int d = 40;

    public void displayA12();
}

class B implements A12{
    public void displayA(){
        System.out.println("A: "+a);
    }

    public void displayA1(){
        System.out.println("A1: "+b);
    }

    public void displayA2(){
        System.out.println("A2: "+c);
    }

    public void displayA12(){
        System.out.println("A12: "+d);
    }
}

public class P1{
    public static void main(String []args){
        B b = new B();
        b.displayA();
        b.displayA1();
        b.displayA2();
        b.displayA12();
    }
}
