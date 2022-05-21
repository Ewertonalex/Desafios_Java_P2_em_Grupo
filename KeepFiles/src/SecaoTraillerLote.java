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
}
