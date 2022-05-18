public class SecaoLote {
    private String TipReg;
    private String ModeloDoPlastico;
    private String NumeroDoKit;
    private String SeqDoLote;
    private String NomeDoPlastico;
    private String TipoProcessamento;
    private String TipoMovimento;
    private String TipoDoCartao;
    private String TipoDeGravacao;
    private String CorDeEntintamento;
    private String TipoDeEnvelopamento;
    private String EtiquetaDeBloqueio;
    private String Overlay;
    private String Postagem;

    public SecaoLote(String tipReg, String modeloDoPlastico, String numeroDoKit,
                     String seqDoLote, String nomeDoPlastico, String tipoProcessamento,
                     String tipoMovimento, String tipoDoCartao, String tipoDeGravacao,
                     String corDeEntintamento, String tipoDeEnvelopamento, String etiquetaDeBloqueio,
                     String overlay, String postagem) {
        TipReg = tipReg;
        ModeloDoPlastico = modeloDoPlastico;
        NumeroDoKit = numeroDoKit;
        SeqDoLote = seqDoLote;
        NomeDoPlastico = nomeDoPlastico;
        TipoProcessamento = tipoProcessamento;
        TipoMovimento = tipoMovimento;
        TipoDoCartao = tipoDoCartao;
        TipoDeGravacao = tipoDeGravacao;
        CorDeEntintamento = corDeEntintamento;
        TipoDeEnvelopamento = tipoDeEnvelopamento;
        EtiquetaDeBloqueio = etiquetaDeBloqueio;
        Overlay = overlay;
        Postagem = postagem;
    }

    public String getTipReg() {
        return TipReg;
    }

    public void setTipReg(String tipReg) {
        TipReg = tipReg;
    }

    public String getModeloDoPlastico() {
        return ModeloDoPlastico;
    }

    public void setModeloDoPlastico(String modeloDoPlastico) {
        ModeloDoPlastico = modeloDoPlastico;
    }

    public String getNumeroDoKit() {
        return NumeroDoKit;
    }

    public void setNumeroDoKit(String numeroDoKit) {
        NumeroDoKit = numeroDoKit;
    }

    public String getSeqDoLote() {
        return SeqDoLote;
    }

    public void setSeqDoLote(String seqDoLote) {
        SeqDoLote = seqDoLote;
    }

    public String getNomeDoPlastico() {
        return NomeDoPlastico;
    }

    public void setNomeDoPlastico(String nomeDoPlastico) {
        NomeDoPlastico = nomeDoPlastico;
    }

    public String getTipoProcessamento() {
        return TipoProcessamento;
    }

    public void setTipoProcessamento(String tipoProcessamento) {
        TipoProcessamento = tipoProcessamento;
    }

    public String getTipoMovimento() {
        return TipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        TipoMovimento = tipoMovimento;
    }

    public String getTipoDoCartao() {
        return TipoDoCartao;
    }

    public void setTipoDoCartao(String tipoDoCartao) {
        TipoDoCartao = tipoDoCartao;
    }

    public String getTipoDeGravacao() {
        return TipoDeGravacao;
    }

    public void setTipoDeGravacao(String tipoDeGravacao) {
        TipoDeGravacao = tipoDeGravacao;
    }

    public String getCorDeEntintamento() {
        return CorDeEntintamento;
    }

    public void setCorDeEntintamento(String corDeEntintamento) {
        CorDeEntintamento = corDeEntintamento;
    }

    public String getTipoDeEnvelopamento() {
        return TipoDeEnvelopamento;
    }

    public void setTipoDeEnvelopamento(String tipoDeEnvelopamento) {
        TipoDeEnvelopamento = tipoDeEnvelopamento;
    }

    public String getEtiquetaDeBloqueio() {
        return EtiquetaDeBloqueio;
    }

    public void setEtiquetaDeBloqueio(String etiquetaDeBloqueio) {
        EtiquetaDeBloqueio = etiquetaDeBloqueio;
    }

    public String getOverlay() {
        return Overlay;
    }

    public void setOverlay(String overlay) {
        Overlay = overlay;
    }

    public String getPostagem() {
        return Postagem;
    }

    public void setPostagem(String postagem) {
        Postagem = postagem;
    }
}
