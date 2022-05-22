import java.util.ArrayList;

public class SecaoTraillerLote {
    private String TipReg;
    private String ModPlast;
    private String Kit;
    private String QtdCartLote;

    public SecaoTraillerLote(String linhaArquivo) {
        this.TipReg = linhaArquivo.substring(0 ,1);
        this.ModPlast = linhaArquivo.substring(1 ,4);
        this.Kit = linhaArquivo.substring(4, 10);
        this.QtdCartLote = linhaArquivo.substring(10, 17);
    }

    public String getTipReg() {
        return TipReg;
    }

    public void setTipReg(String tipReg) {
        TipReg = tipReg;
    }

    public String getModPlast() {
        return ModPlast;
    }

    public void setModPlast(String modPlast) {
        ModPlast = modPlast;
    }

    public String getKit() {
        return Kit;
    }

    public void setKit(String kit) {
        Kit = kit;
    }

    public String getQtdCartLote() {
        return QtdCartLote;
    }

    public void setQtdCartLote(String qtdCartLote) {
        QtdCartLote = qtdCartLote;
    }

    public void validarLinha(SecaoTraillerLote secaoTraillerLote, ArrayList<String> listaErros){

        try{
            char[] arr = getTipReg().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoTRaillerLote, no campo TipReg.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoTraillerLote.getTipReg()+"]");
        }

        try{
            char[] arr = getModPlast().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoTRaillerLote, no campo ModPlast.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoTraillerLote.getModPlast()+"]");
        }

        try{
            char[] arr = getKit().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoTRaillerLote, no campo Kit.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoTraillerLote.getKit()+"]");
        }

        try{
            char[] arr = getQtdCartLote().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoTraillerLote, no campo QtdCartLote.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoTraillerLote.getQtdCartLote()+"]");
        }



    }

    private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
}
