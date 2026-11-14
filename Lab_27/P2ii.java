import java.io.*;

public class P2ii{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("file1.txt");
            FileWriter fw = new FileWriter("file2.txt");

            int ch;

            while((ch = fr.read()) != -1){
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully");

        } 
        catch(IOException e){
            System.out.println(e);
        }
    }
}
