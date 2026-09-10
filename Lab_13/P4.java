import java.util.Scanner;

class Complex{
    double real;
    double imaginary;

    // Default Constructor
    Complex(){
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized Constructor
    Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy Constructor
    Complex(Complex c){
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    public Complex add(Complex c){
        Complex temp = new Complex();

        temp.real = this.real + c.real;
        temp.imaginary = this.imaginary + c.imaginary;

        return temp;
    }

    public void display(){
        System.out.print(this.real + " + " + this.imaginary);
    }
}

public class P4{
    public static void main(String []args){
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);

        Complex c3 = c1.add(c2);

        System.out.print("First complex number: ");
        c1.display();
        System.out.println();

        System.out.print("Second complex number: ");
        c2.display();
        System.out.println();

        System.out.print("Addition: ");
        c3.display();
    }
}