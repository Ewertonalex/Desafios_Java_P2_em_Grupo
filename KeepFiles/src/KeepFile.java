import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class KeepFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\GOLD_180422.txt";
        ArrayList<String> listaErros = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null) {
                if(line.substring(0,1).equals("0")){
                    SecaoGeral secaoGeral = new SecaoGeral(line);
                    System.out.println(secaoGeral.getBanco());
                    System.out.println(secaoGeral.getSistOrig());

                    secaoGeral.validarLinha(secaoGeral,listaErros);
                }else
                    if(line.substring(0,1).equals("1")){

                    }
//                System.out.println(line.substring(0,2));

                line = br.readLine();
            }

        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}