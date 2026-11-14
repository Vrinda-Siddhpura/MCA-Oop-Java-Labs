import java.io.*;

public class P2{
    public static void main(String[] args){
        try{
            FileInputStream fin = new FileInputStream(args[0]);

            int ch;
            int count = 0;

            while((ch = fin.read()) != -1){
                if(ch=='5'){
                    count++;
                }
            }

            fin.close();

            System.out.println("Number of 5: " + count);

        } 
        catch(FileNotFoundException e){
            System.out.println("File not found!");
        } 
        catch(IOException e){
            System.out.println(e);
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter file name!");
        }
    }
}
