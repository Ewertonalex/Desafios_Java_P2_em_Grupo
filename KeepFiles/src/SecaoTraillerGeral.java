public class SecaoTraillerGeral {
    private String TipReg;
    private String QtdCartArq;

    public SecaoTraillerGeral(String tipReg, String qtdCartArq) {
        TipReg = tipReg;
        QtdCartArq = qtdCartArq;
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
