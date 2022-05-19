import java.util.ArrayList;

public class SecaoGeral {
    private String TipRegHg;
    private String Banco;
    private String Nsp;
    private String SistOrig;
    private String DtMovto;

    public SecaoGeral(String linhaArquivo) {
        this.TipRegHg = linhaArquivo.substring(0,1);
        this.Banco = linhaArquivo.substring(13,32);
        this.Nsp = linhaArquivo.substring(3,5);
        this.SistOrig = linhaArquivo.substring(5,9);
        this. DtMovto = linhaArquivo.substring(10,14);
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
        if(isInteger(secaoGeral.Nsp)){
            try{
                int i = Integer.parseInt(secaoGeral.Nsp);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoGeral.getTipRegHg()+"] - Esperava int e contem String - valor: "+secaoGeral.getNsp());
            }

            listaErros.add(("Problema no arquivo XTOP, na secao geral, na com campo NSP "));
        }

        secaoGeral.getNsp(); //voces precisam buscar como validar campo numerico.


    }
    private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
}
