import java.io.*;

public class P3i{
    public static void main(String[] args){
        try{
            BufferedInputStream bin = new BufferedInputStream(new FileInputStream("file1.txt"));

            BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("file2.txt"));

            int ch;

            while((ch = bin.read()) != -1){
                bout.write(ch);
            }

            bin.close();
            bout.close();

            System.out.println("File copied successfully");

        } 
        catch(IOException e){
            System.out.println(e);
        }
    }
}
