import java.io.*;

public class P1{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));

            int characters = 0;
            int words = 0;
            int lines = 0;

            String line;

            while((line = br.readLine()) != null){
                lines++;

                characters = characters + line.length();

                String w[] = line.split("\\s+");

                if(!line.trim().isEmpty()){
                    words = words + w.length;
                }
            }

            br.close();

            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);

        } 
        catch(FileNotFoundException e){
            System.out.println("File does not exist!");
        } 
        catch(IOException e){
            System.out.println(e);
        }
    }
}
