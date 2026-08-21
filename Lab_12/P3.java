import java.util.Scanner;

class Book{
    String title;
    double price;

    // Default constructor
    Book(){
        title = "ABC";
        price = 500;
    }

    // Constructor accepting title
    Book(String title){
        this.title = title;
        price = 500;
    }

    // Constructor accepting title and price
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void display(){
        System.out.println();
        System.out.println("Book Title: "+title);
        System.out.println("Price: "+price);
    }
}

public class P3{
    public static void main(String []args){
        Book b1 = new Book();

        Book b2 = new Book("XYZ");

        Book b3 = new Book("PQR", 500);

        b1.display();        
        b2.display();        
        b3.display();        
    }   
}