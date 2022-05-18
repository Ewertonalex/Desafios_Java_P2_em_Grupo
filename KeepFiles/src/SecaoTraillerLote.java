public class SecaoTraillerLote {
    private String TipReg;
    private String ModPlast;
    private String Kit;
    private String QtdCartLote;

    public SecaoTraillerLote(String tipReg, String modPlast, String kit, String qtdCartLote) {
        TipReg = tipReg;
        ModPlast = modPlast;
        Kit = kit;
        QtdCartLote = qtdCartLote;
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
}
