import java.io.*;

public class P2i{
    public static void main(String[] args){
        try{
            FileInputStream fin = new FileInputStream("file1.txt");
            FileOutputStream fout = new FileOutputStream("file2.txt");

            int ch;

            while((ch = fin.read()) != -1){
                fout.write(ch);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully");

        } 
        catch(IOException e){
            System.out.println(e);
        }
    }
}
