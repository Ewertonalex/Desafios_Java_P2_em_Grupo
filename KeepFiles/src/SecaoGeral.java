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
        this.Nsp = linhaArquivo.substring(5,12);
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
        if(isInteger(secaoGeral.TipRegHg)){
            try{
                int i = Integer.parseInt(secaoGeral.TipRegHg);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoGeral.getTipRegHg()+"] - Esperava int e contém String - valor: "+secaoGeral.getTipRegHg());
            }

            listaErros.add(("Problema no arquivo de embossing, na seção geral, no campo TipRegHg."));

        }else if(isInteger(secaoGeral.Banco)){
            try{
                int i = Integer.parseInt(secaoGeral.Banco);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoGeral.getBanco()+"] - Esperava int e contém String - valor: "+secaoGeral.getBanco());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção geral, no campo Banco."));
        }else if(isInteger(secaoGeral.Nsp)){
            try{
                int i = Integer.parseInt(secaoGeral.Nsp);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoGeral.getNsp()+"] - Esperava int e contém String - valor: "+secaoGeral.getNsp());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção geral, no campo Nsp."));
        }else if(isInteger(secaoGeral.SistOrig)){
            try{
                int i = Integer.parseInt(secaoGeral.SistOrig);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoGeral.getSistOrig()+"] - Esperava int e contém String - valor: "+secaoGeral.getSistOrig());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção geral, no campo SistOrig."));
        }else if(isInteger(secaoGeral.DtMovto)){
            try{
                int i = Integer.parseInt(secaoGeral.DtMovto);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoGeral.getDtMovto()+"] - Esperava int e contém String - valor: "+secaoGeral.getDtMovto());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção geral, no campo DtMovto."));
        }

        secaoGeral.getNsp(); //voces precisam buscar como validar campo numerico.


    }
    private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
}
