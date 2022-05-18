public class SecaoGeral {
    private String TipRegHg;
    private String Banco;
    private String Nsp;
    private String SistOrig;
    private String DtMovto;

    public SecaoGeral(String tipRegHg, String banco, String nsp, String sistOrig, String dtMovto) {
        this.TipRegHg = tipRegHg;
        this.Banco = banco;
        this.Nsp = nsp;
        this.SistOrig = sistOrig;
        this. DtMovto = dtMovto;
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
}
