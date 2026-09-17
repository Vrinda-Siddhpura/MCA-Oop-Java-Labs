class Book{
    private String author_name;

    Book(String author_name){
        this.author_name = author_name;
    }

    public void display(){
        System.out.println("Author: "+this.author_name);
    }
}

class Book_publication extends Book{
    private String title;

    Book_publication(String author_name, String title){
        super(author_name);
        this.title = title;
    }

    public void display(){
        System.out.println("Book Information...");
        super.display();
        System.out.println("Title: "+this.title);
    }
}

class Paper_publication extends Book{
    private String title;

    Paper_publication(String author_name, String title){
        super(author_name);
        this.title = title;
    }

    public void display(){
        System.out.println("Paper Information...");
        super.display();
        System.out.println("Title: "+this.title);
    }
}

public class P3{
    public static void main(String []args){
        String a = args[0];
        String b = args[1];
        String c = args[2];

        Book b1;
        if(a.equalsIgnoreCase("book")){
            b1 = new Book_publication(b, c);
        }
        else if(a.equalsIgnoreCase("paper")){
            b1 = new Paper_publication(b, c);
        }
        else{
            System.out.println("Invalid details...");
            return;
        }
        b1.display();
    }
}