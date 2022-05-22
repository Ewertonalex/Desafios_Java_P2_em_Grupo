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


                if(line.substring(0,1).equals("0")){ //Caso o número inicial da linha seja 0
                    SecaoGeral secaoGeral = new SecaoGeral(line);

                    secaoGeral.validarLinha(secaoGeral,listaErros);
                }else if(line.substring(0,1).equals("1")){//Caso o número inicial da linha seja 1
                    SecaoLote secaoLote = new SecaoLote(line);

                    secaoLote.validarLinha(secaoLote, listaErros);

                }else if(line.substring(0,1).equals("2")){ //Caso o número inicial da linha seja 2
                    SecaoDetalhe secaoDetalhe = new SecaoDetalhe(line);

                    secaoDetalhe.validarLinha(secaoDetalhe, listaErros);

                }else if(line.substring(0,1).equals("3")){ //Caso o número inicial da linha seja 3
                    SecaoTraillerLote secaoTraillerLote = new SecaoTraillerLote(line);

                    secaoTraillerLote.validarLinha(secaoTraillerLote, listaErros);

                }else if(line.substring(0,1).equals("9")){ //Caso o número inicial da linha seja 9
                    SecaoTraillerGeral secaoTraillerGeral = new SecaoTraillerGeral(line);

                    secaoTraillerGeral.validarLinha(secaoTraillerGeral, listaErros);

                }else{
                    listaErros.add("Erro no arquivo na linha " + line); // Exibindo erro e imprimindo a linha que contém o erro
                }

                line = br.readLine();
            }

        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (listaErros.isEmpty()){
            System.out.println("========= O arquivo está validado com sucesso! =========");
        }else {
            for(int i = 0; i < listaErros.size(); i++) {
                System.out.print(listaErros);
            }
        }



    }
}