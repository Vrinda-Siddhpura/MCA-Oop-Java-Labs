import java.io.*;

public class P1{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("file1.txt"));

            BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));

            String line;
            int count = 0;

            while((line=br.readLine()) != null){

                int index = 0;

                while((index=line.indexOf("word1", index)) != -1){
                    count++;
                    index = index + 5;
                }

                line = line.replace("word1", "word2");

                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("File replaced successfully");
            System.out.println("Total replacements: " + count);

        }catch(IOException e) {
            System.out.println(e);
        }
    }
}
