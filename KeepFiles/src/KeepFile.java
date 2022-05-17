import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class KeepFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:GOLD_180422.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            char caractere = (char)br.read();


            while(line != null) {
                System.out.println(line);
                //System.out.println(caractere);
                //caractere = (char)br.read();


                line = br.readLine();
            }

        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}