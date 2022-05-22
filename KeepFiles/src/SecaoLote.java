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

        try{
            char[] arr = getTipReg().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo TipReg.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getTipReg()+"]");
        }

        try{
            char[] arr = getModeloDoPlastico().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo ModeloDoPlastico.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getModeloDoPlastico()+"]");
        }

        try{
            char[] arr = getNumeroDoKit().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo NumeroDoKit.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getNumeroDoKit()+"]");
        }

        try{
            char[] arr = getSeqDoLote().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo SeqDoLote.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getSeqDoLote()+"]");
        }

        try{
            char[] arr = getNomeDoPlastico().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo NomeDoPlastico.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getNomeDoPlastico()+"]");
        }

        try{
            char[] arr = getTipoProcessamento().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo TipoProcessamento.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getTipoProcessamento()+"]");
        }

        try{
            char[] arr = getTipoMovimento().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo TipoMovimento.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getTipoMovimento()+"]");
        }

        try{
            char[] arr = getTipoDoCartao().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo TipoDoCartao.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getTipoDoCartao()+"]");
        }

        try{
            char[] arr = getTipoDeGravacao().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo TipoDeGravacao.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getTipoDeGravacao()+"]");
        }

        try{
            char[] arr = getCorDeEntintamento().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo CorDeEntintamento.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getCorDeEntintamento()+"]");
        }

        try{
            char[] arr = getTipoDeEnvelopamento().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo TipoDeEnvelopamento.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getTipoDeEnvelopamento()+"]");
        }

        try{
            char[] arr = getTipoDeEnderecamento().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo TipoDeEnderecamento.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getTipoDeEnderecamento()+"]");
        }

        try{
            char[] arr = getEtiquetaDeBloqueio().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo EtiquetaDeBloqueio.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getEtiquetaDeBloqueio()+"]");
        }

        try{
            char[] arr = getOverlay().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo Overlay.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getOverlay()+"]");
        }
        
        try{
            char[] arr = getPostagem().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoLote, no campo Postagem.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+SecaoLote.getPostagem()+"]");
        }


    }

    private static boolean isInteger(String str) {

        return str != null && str.matches("[0-9]*");
    }
}
