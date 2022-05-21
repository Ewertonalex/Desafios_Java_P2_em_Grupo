import java.util.ArrayList;

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
    private String TipoDeEnderecamento;
    private String EtiquetaDeBloqueio;
    private String Overlay;
    private String Postagem;

    public SecaoLote(String linhaArquivo) {
        this.TipReg = linhaArquivo.substring(0,1);
        this.ModeloDoPlastico = linhaArquivo.substring(1,4);
        this.NumeroDoKit = linhaArquivo.substring(4,10);
        this.SeqDoLote = linhaArquivo.substring(10,14);
        this.NomeDoPlastico = linhaArquivo.substring(14,34);
        this.TipoProcessamento = linhaArquivo.substring(34,36);
        this.TipoMovimento = linhaArquivo.substring(36,38);
        this.TipoDoCartao = linhaArquivo.substring(38,40);
        this.TipoDeGravacao = linhaArquivo.substring(40,42);
        this.CorDeEntintamento = linhaArquivo.substring(42,44);
        this.TipoDeEnvelopamento = linhaArquivo.substring(44,46);
        this.TipoDeEnderecamento = linhaArquivo.substring(46,48);
        this.EtiquetaDeBloqueio = linhaArquivo.substring(48,50);
        this.Overlay = linhaArquivo.substring(50,52);
        this.Postagem = linhaArquivo.substring(52,54);
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

    public String getTipoDeEnderecamento() { return TipoDeEnderecamento;}

    public void setTipoDeEnderecamento(String tipoDeEnderecamento) { TipoDeEnderecamento = tipoDeEnderecamento; }

    public void validarLinha(SecaoLote secaoLote, ArrayList<String> listaErros){
        if(isInteger(secaoLote.TipReg)){
            try{
                int i = Integer.parseInt(secaoLote.TipReg);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getTipReg()+"] - Esperava int e contém String - valor: "+secaoLote.getTipReg());
            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo TipReg."));

        }else if(isInteger(secaoLote.ModeloDoPlastico)){
            try{
                int i = Integer.parseInt(secaoLote.ModeloDoPlastico);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getModeloDoPlastico()+"] - Esperava int e contém String - valor: "+secaoLote.getModeloDoPlastico());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo ModeloDoPlastico."));
        }else if(isInteger(secaoLote.NumeroDoKit)){
            try{
                int i = Integer.parseInt(secaoLote.NumeroDoKit);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getNumeroDoKit()+"] - Esperava int e contém String - valor: "+secaoLote.getNumeroDoKit());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo NumeroDoKit."));
        }else if(isInteger(secaoLote.SeqDoLote)){
            try{
                int i = Integer.parseInt(secaoLote.SeqDoLote);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getSeqDoLote()+"] - Esperava int e contém String - valor: "+secaoLote.getSeqDoLote());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo SeqDoLote."));
        }else if(isInteger(secaoLote.NomeDoPlastico)){
            try{
                int i = Integer.parseInt(secaoLote.NomeDoPlastico);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getNomeDoPlastico()+"] - Esperava int e contém String - valor: "+secaoLote.getNomeDoPlastico());

            }

            listaErros.add(("Problema no arquivo de embossing, na sseção Lote, no campo NomeDoPlastico."));
        }else if(isInteger(secaoLote.TipoProcessamento)){
            try{
                int i = Integer.parseInt(secaoLote.TipoProcessamento);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getTipoProcessamento()+"] - Esperava int e contém String - valor: "+secaoLote.getTipoProcessamento());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo TipoProcessamento."));
        }else if(isInteger(secaoLote.TipoMovimento)){
            try{
                int i = Integer.parseInt(secaoLote.TipoMovimento);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getTipoMovimento()+"] - Esperava int e contém String - valor: "+secaoLote.getTipoMovimento());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo TipoMovimento."));
        }else if(isInteger(secaoLote.TipoDoCartao)){
            try{
                int i = Integer.parseInt(secaoLote.TipoDoCartao);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getTipoDoCartao()+"] - Esperava int e contém String - valor: "+secaoLote.getTipoDoCartao());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo TipoDoCartao."));
        }else if(isInteger(secaoLote.TipoDeGravacao)){
            try{
                int i = Integer.parseInt(secaoLote.TipoDeGravacao);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getTipoDeGravacao()+"] - Esperava int e contém String - valor: "+secaoLote.getTipoDeGravacao());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo TipoDeGravacao."));
        }else if(isInteger(secaoLote.CorDeEntintamento)){
            try{
                int i = Integer.parseInt(secaoLote.CorDeEntintamento);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getCorDeEntintamento()+"] - Esperava int e contém String - valor: "+secaoLote.getCorDeEntintamento());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo CorDeEntintamento."));
        }else if(isInteger(secaoLote.TipoDeEnvelopamento)){
            try{
                int i = Integer.parseInt(secaoLote.TipoDeEnvelopamento);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getTipoDeEnvelopamento()+"] - Esperava int e contém String - valor: "+secaoLote.getTipoDeEnvelopamento());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo TipoDeEnvelopamento."));
        }else if(isInteger(secaoLote.TipoDeEnderecamento)){
            try{
                int i = Integer.parseInt(secaoLote.TipoDeEnderecamento);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getTipoDeEnderecamento()+"] - Esperava int e contém String - valor: "+secaoLote.getTipoDeEnderecamento());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo TipoDeEnderecamento."));
        }else if(isInteger(secaoLote.EtiquetaDeBloqueio)){
            try{
                int i = Integer.parseInt(secaoLote.EtiquetaDeBloqueio);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getEtiquetaDeBloqueio()+"] - Esperava int e contém String - valor: "+secaoLote.getEtiquetaDeBloqueio());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo EtiquetaDeBloqueio."));
        }else if(isInteger(secaoLote.Overlay)){
            try{
                int i = Integer.parseInt(secaoLote.Overlay);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getOverlay()+"] - Esperava int e contém String - valor: "+secaoLote.getOverlay());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo Overlay."));
        }else if(isInteger(secaoLote.Postagem)){
            try{
                int i = Integer.parseInt(secaoLote.Postagem);
            }catch (Exception e){
                e.getMessage();
                listaErros.add("Linha secao: ["+secaoLote.getPostagem()+"] - Esperava int e contém String - valor: "+secaoLote.getPostagem());

            }

            listaErros.add(("Problema no arquivo de embossing, na seção Lote, no campo Postagem."));
        }


    }

    private static boolean isInteger(String str) {

        return str != null && str.matches("[0-9]*");
    }
}
