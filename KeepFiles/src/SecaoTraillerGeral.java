import java.util.ArrayList;

public class SecaoTraillerGeral {
    private String TipReg;
    private String QtdCartArq;

    public SecaoTraillerGeral(String linhaArquivo) {
        this.TipReg = linhaArquivo.substring(0, 1);
        this.QtdCartArq = linhaArquivo.substring(1, 8);
    }

    public String getTipReg() {
        return TipReg;
    }

    public void setTipReg(String tipReg) {
        TipReg = tipReg;
    }

    public String getQtdCartArq() {
        return QtdCartArq;
    }

    public void setQtdCartArq(String qtdCartArq) {
        QtdCartArq = qtdCartArq;
    }

    public void validarLinha(SecaoTraillerGeral secaoTraillerGeral, ArrayList<String> listaErros){

        if(isInteger(secaoTraillerGeral.TipReg)){
            try{
                int i = Integer.parseInt(secaoTraillerGeral.TipReg);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoTraillerGeral.getTipReg()+"] - Esperava int e contém String - valor: "+secaoTraillerGeral.getTipReg());
            }

            listaErros.add(("Problema no arquivo de embossing, na seção traillerGeral, no campo TipReg."));

        }else if(isInteger(secaoTraillerGeral.QtdCartArq)){
            try{
                int i = Integer.parseInt(secaoTraillerGeral.QtdCartArq);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoTraillerGeral.getQtdCartArq()+"] - Esperava int e contém String - valor: "+secaoTraillerGeral.getQtdCartArq());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção traillerGeral, no campo QtdCartArq."));
        }

    }

    private static boolean isInteger(String str) {

        return str != null && str.matches("[0-9]*");
    }
}
