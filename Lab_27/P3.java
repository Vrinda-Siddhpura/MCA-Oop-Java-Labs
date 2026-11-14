import java.io.*;
import java.util.*;

class Student{
    int id;
    String name;
    double spi;

    void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter SPI: ");
        spi = sc.nextDouble();
    }

    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("SPI: " + spi);
    }
}

public class P3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choice;

        do{
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice == 1){
                Student s = new Student();
                s.getData();

                try{
                    FileOutputStream fout = new FileOutputStream("student.txt", true);

                    String data = s.id + "," + s.name + "," + s.spi + "\n";

                    fout.write(data.getBytes());
                    fout.close();

                    System.out.println("Student added successfully");

                } 
                catch(IOException e){
                    System.out.println(e);
                }
            }

            else if(choice==2){
                try{
                    FileInputStream fin = new FileInputStream("student.txt");

                    int ch;

                    while((ch=fin.read())!=-1){
                        System.out.print((char) ch);
                    }

                    fin.close();

                } 
                catch(IOException e){
                    System.out.println("File not found!");
                }
            }
        } while(choice != 3);

        sc.close();
    }
}
