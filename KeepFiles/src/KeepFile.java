import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KeepFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\GOLD_180422.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null) {
                System.out.println(line.substring(0,2));

                line = br.readLine();
            }

        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}