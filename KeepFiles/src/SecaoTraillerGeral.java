public class SecaoTraillerGeral {
    private String TipReg;
    private String QtdCartArq;

    public SecaoTraillerGeral(String linhaArquivo) {
        this.TipReg = linhaArquivo.substring(0, 0);
        this.QtdCartArq = linhaArquivo.substring(1, 7);
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
}
