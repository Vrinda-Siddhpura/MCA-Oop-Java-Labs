import java.io.*;

public class P3ii{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("file1.txt"));

            BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));

            String line;

            while((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("File copied successfully");

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
