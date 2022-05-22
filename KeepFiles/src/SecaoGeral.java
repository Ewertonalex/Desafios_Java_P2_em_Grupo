import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;

public class SecaoGeral {
    private String TipRegHg;
    private String Banco;
    private String Nsp;
    private String SistOrig;
    private String DtMovto;

    public SecaoGeral(String linhaArquivo) {
        this.TipRegHg = linhaArquivo.substring(0,1);
        this.Banco = linhaArquivo.substring(1,5);
        this.Nsp = linhaArquivo.substring(5,13);
        this.SistOrig = linhaArquivo.substring(13,32);
        this. DtMovto = linhaArquivo.substring(32,40);
    }

    public String getTipRegHg() {
        return TipRegHg;
    }

    public void setTipRegHg(String tipRegHg) {
        TipRegHg = tipRegHg;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    public String getNsp() {
        return Nsp;
    }

    public void setNsp(String nsp) {
        Nsp = nsp;
    }

    public String getSistOrig() {
        return SistOrig;
    }

    public void setSistOrig(String sistOrig) {
        SistOrig = sistOrig;
    }

    public String getDtMovto() {
        return DtMovto;
    }

    public void setDtMovto(String dtMovto) {
        DtMovto = dtMovto;
    }

    public void validarLinha(SecaoGeral secaoGeral, ArrayList<String> listaErros) {

        try{
            char[] arr = getTipRegHg().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoGeral, no campo TipRegHg.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoGeral.getTipRegHg()+"]");
        }

        try{
            char[] arr = getBanco().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoGeral, no campo Banco.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoGeral.getBanco()+"]");
        }

        try{
            char[] arr = getNsp().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoGeral, no campo Nsp.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoGeral.getNsp()+"]");
        }

        try{
            char[] arr = getSistOrig().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoGeral, no campo SistOrig.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoGeral.getSistOrig()+"]");
        }

        try{
            char[] arr = getDtMovto().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoGeral, no campo DtMovto.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoGeral.getDtMovto()+"]");
        }





    }
    private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
}
