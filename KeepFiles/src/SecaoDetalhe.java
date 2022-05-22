import java.util.ArrayList;

public class SecaoDetalhe {

    private String TipRegDetalhe;
    private String ModPlast;
    private String Kit;
    private String SeqCart;
    private String Linha01;
    private String Linha02;
    private String Linha03;
    private String Linha04;
    private String LinhaVerso;
    private String Trilha01;
    private String Trilha02;
    private String Trilha03;
    private String QtdCartoes;
    private String Nome;
    private String DadosEndereco;
    private String Bairro;
    private String Cidade;
    private String Uf;
    private String Cep;
    private String NroAr;
    private String CepAr;
    private String CodRegional;
    private String CodAgencia;
    private String NmAbrAge;
    private String TpUorPab;
    private String CodUorPab;
    private String NmAbrPab;
    private String Folder;
    private String CodPab;
    private String NomeAdicional;
    private String EnderecoAge;
    private String BairroAge;
    private String CidadeAge;
    private String UfAge;
    private String CepAge;
    private String ContaCorrente;
    private String Tm;
    private String Template;
    private String Tm2;
    private String Complemento;
    private String CodPlast;
    private String Empresa;
    private String Foto;
    private String VlLimite;
    private String DiaVenc;
    private String CodigoBarras;
    private String DeficienteVisual;
    private String Senha;
    private String Trilha01Icvv;
    private String Trilha02Icvv;
    private String CcrAntigo;
    private String CodigoCartao;
    private String NomeOrigemComercial;
    private String Matricula;
    private String Cargo;
    private String Documento;
    private String Ddd;
    private String Telefone;
    private String Vago;
    private String Panvas;
    private String NumeroEndereco;
    private String ComplementoEndereco;

    public SecaoDetalhe(String linhaArquivo) {
        this.TipRegDetalhe = linhaArquivo.substring(0,1);
        this.ModPlast = linhaArquivo.substring(1,4);
        this.Kit = linhaArquivo.substring(4,10);
        this.SeqCart = linhaArquivo.substring(10,16);
        this.Linha01 = linhaArquivo.substring(16,56);
        this.Linha02 = linhaArquivo.substring(56,96);
        this.Linha03 = linhaArquivo.substring(96,136);
        this.Linha04 = linhaArquivo.substring(136,176);
        this.LinhaVerso = linhaArquivo.substring(176,216);
        this.Trilha01 = linhaArquivo.substring(216,294);
        this.Trilha02 = linhaArquivo.substring(294,333);
        this.Trilha03 = linhaArquivo.substring(333,440);
        this.QtdCartoes = linhaArquivo.substring(440,442);
        this.Nome = linhaArquivo.substring(442,468);
        this.DadosEndereco = linhaArquivo.substring(468,518);
        this.Bairro = linhaArquivo.substring(518,538);
        this.Cidade = linhaArquivo.substring(538,558);
        this.Uf = linhaArquivo.substring(558,560);
        this.Cep = linhaArquivo.substring(560,568);
        this.NroAr = linhaArquivo.substring(568,577);
        this.CepAr = linhaArquivo.substring(577,581);
        this.CodRegional = linhaArquivo.substring(581,584);
        this.CodAgencia = linhaArquivo.substring(584,588);
        this.NmAbrAge = linhaArquivo.substring(588,603);
        this.TpUorPab = linhaArquivo.substring(603,606);
        this.CodUorPab = linhaArquivo.substring(606,610);
        this.NmAbrPab = linhaArquivo.substring(610,625);
        this.Folder = linhaArquivo.substring(625,634);
        this.CodPab = linhaArquivo.substring(634,636);
        this.NomeAdicional = linhaArquivo.substring(636,681);
        this.EnderecoAge = linhaArquivo.substring(681,731);
        this.BairroAge = linhaArquivo.substring(731,751);
        this.CidadeAge = linhaArquivo.substring(751,771);
        this.UfAge = linhaArquivo.substring(771,773);
        this.CepAge = linhaArquivo.substring(773,781);
        this.ContaCorrente = linhaArquivo.substring(781,797);
        this.Tm = linhaArquivo.substring(797,800);
        this.Template = linhaArquivo.substring(800,810);
        this.Tm2 = linhaArquivo.substring(810,811);
        this.Complemento = linhaArquivo.substring(811,831);
        this.CodPlast = linhaArquivo.substring(831,834);
        this.Empresa = linhaArquivo.substring(834,853);
        this.Foto = linhaArquivo.substring(853,861);
        this.VlLimite = linhaArquivo.substring(861,873);
        this.DiaVenc = linhaArquivo.substring(874,876);
        this.CodigoBarras = linhaArquivo.substring(875,885);
        this.DeficienteVisual = linhaArquivo.substring(885,886);
        this.Senha = linhaArquivo.substring(886,902);
        this.Trilha01Icvv = linhaArquivo.substring(902,980);
        this.Trilha02Icvv = linhaArquivo.substring(980,1019);
        this.CcrAntigo = linhaArquivo.substring(1019,1031);
        this.CodigoCartao = linhaArquivo.substring(1031,1043);
        this.NomeOrigemComercial = linhaArquivo.substring(1043,1063);
        this.Matricula = linhaArquivo.substring(1063,1083);
        this.Cargo = linhaArquivo.substring(1083,1113);
        this.Documento = linhaArquivo.substring(1113,1124);
        this.Ddd = linhaArquivo.substring(1124,1126);
        this.Telefone = linhaArquivo.substring(1126,1135);
        this.Vago = linhaArquivo.substring(1135,1140);
        this.Panvas = linhaArquivo.substring(1140,1156);
        this.NumeroEndereco = linhaArquivo.substring(1156,1166);
        this.ComplementoEndereco = linhaArquivo.substring(1166,1196);
    }

    public String getTipRegDetalhe() {
        return TipRegDetalhe;
    }

    public void setTipRegDetalhe(String tipRegDetalhe) {
        TipRegDetalhe = tipRegDetalhe;
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

    public String getSeqCart() {
        return SeqCart;
    }

    public void setSeqCart(String seqCart) {
        SeqCart = seqCart;
    }

    public String getLinha01() {
        return Linha01;
    }

    public void setLinha01(String linha01) {
        Linha01 = linha01;
    }

    public String getLinha02() {
        return Linha02;
    }

    public void setLinha02(String linha02) {
        Linha02 = linha02;
    }

    public String getLinha03() {
        return Linha03;
    }

    public void setLinha03(String linha03) {
        Linha03 = linha03;
    }

    public String getLinha04() {
        return Linha04;
    }

    public void setLinha04(String linha04) {
        Linha04 = linha04;
    }

    public String getLinhaVerso() {
        return LinhaVerso;
    }

    public void setLinhaVerso(String linhaVerso) {
        LinhaVerso = linhaVerso;
    }

    public String getTrilha01() {
        return Trilha01;
    }

    public void setTrilha01(String trilha01) {
        Trilha01 = trilha01;
    }

    public String getTrilha02() {
        return Trilha02;
    }

    public void setTrilha02(String trilha02) {
        Trilha02 = trilha02;
    }

    public String getTrilha03() {
        return Trilha03;
    }

    public void setTrilha03(String trilha03) {
        Trilha03 = trilha03;
    }

    public String getQtdCartoes() {
        return QtdCartoes;
    }

    public void setQtdCartoes(String qtdCartoes) {
        QtdCartoes = qtdCartoes;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDadosEndereco() {
        return DadosEndereco;
    }

    public void setDadosEndereco(String dadosEndereco) {
        DadosEndereco = dadosEndereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String uf) {
        Uf = uf;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public String getNroAr() {
        return NroAr;
    }

    public void setNroAr(String nroAr) {
        NroAr = nroAr;
    }

    public String getCepAr() {
        return CepAr;
    }

    public void setCepAr(String cepAr) {
        CepAr = cepAr;
    }

    public String getCodRegional() {
        return CodRegional;
    }

    public void setCodRegional(String codRegional) {
        CodRegional = codRegional;
    }

    public String getCodAgencia() {
        return CodAgencia;
    }

    public void setCodAgencia(String codAgencia) {
        CodAgencia = codAgencia;
    }

    public String getNmAbrAge() {
        return NmAbrAge;
    }

    public void setNmAbrAge(String nmAbrAge) {
        NmAbrAge = nmAbrAge;
    }

    public String getTpUorPab() {
        return TpUorPab;
    }

    public void setTpUorPab(String tpUorPab) {
        TpUorPab = tpUorPab;
    }

    public String getCodUorPab() {
        return CodUorPab;
    }

    public void setCodUorPab(String codUorPab) {
        CodUorPab = codUorPab;
    }

    public String getNmAbrPab() {
        return NmAbrPab;
    }

    public void setNmAbrPab(String nmAbrPab) {
        NmAbrPab = nmAbrPab;
    }

    public String getFolder() {
        return Folder;
    }

    public void setFolder(String folder) {
        Folder = folder;
    }

    public String getCodPab() {
        return CodPab;
    }

    public void setCodPab(String codPab) {
        CodPab = codPab;
    }

    public String getNomeAdicional() {
        return NomeAdicional;
    }

    public void setNomeAdicional(String nomeAdicional) {
        NomeAdicional = nomeAdicional;
    }

    public String getEnderecoAge() {
        return EnderecoAge;
    }

    public void setEnderecoAge(String enderecoAge) {
        EnderecoAge = enderecoAge;
    }

    public String getBairroAge() {
        return BairroAge;
    }

    public void setBairroAge(String bairroAge) {
        BairroAge = bairroAge;
    }

    public String getCidadeAge() {
        return CidadeAge;
    }

    public void setCidadeAge(String cidadeAge) {
        CidadeAge = cidadeAge;
    }

    public String getUfAge() {
        return UfAge;
    }

    public void setUfAge(String ufAge) {
        UfAge = ufAge;
    }

    public String getCepAge() {
        return CepAge;
    }

    public void setCepAge(String cepAge) {
        CepAge = cepAge;
    }

    public String getContaCorrente() {
        return ContaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        ContaCorrente = contaCorrente;
    }

    public String getTm() {
        return Tm;
    }

    public void setTm(String tm) {
        Tm = tm;
    }

    public String getTemplete() {
        return Template;
    }

    public void setTemplete(String templete) {
        Template = templete;
    }

    public String getTm2() {
        return Tm2;
    }

    public void setTm2(String tm2) {
        Tm2 = tm2;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public String getCodPlast() {
        return CodPlast;
    }

    public void setCodPlast(String codPlast) {
        CodPlast = codPlast;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }

    public String getVlLimite() {
        return VlLimite;
    }

    public void setVlLimite(String vlLimite) {
        VlLimite = vlLimite;
    }

    public String getDiaVenc() {
        return DiaVenc;
    }

    public void setDiaVenc(String diaVenc) {
        DiaVenc = diaVenc;
    }

    public String getCodigoBarras() {
        return CodigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        CodigoBarras = codigoBarras;
    }

    public String getDevicienteVisual() {
        return DeficienteVisual;
    }

    public void setDevicienteVisual(String devicienteVisual) {
        DeficienteVisual = devicienteVisual;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getTrilha01Icvv() {
        return Trilha01Icvv;
    }

    public void setTrilha01Icvv(String trilha01Icvv) {
        Trilha01Icvv = trilha01Icvv;
    }

    public String getTrilha02Icvv() {
        return Trilha02Icvv;
    }

    public void setTrilha02Icvv(String trilha02Icvv) {
        Trilha02Icvv = trilha02Icvv;
    }

    public String getCcrAntigo() {
        return CcrAntigo;
    }

    public void setCcrAntigo(String ccrAntigo) {
        CcrAntigo = ccrAntigo;
    }

    public String getCodigoCartao() {
        return CodigoCartao;
    }

    public void setCodigoCartao(String codigoCartao) {
        CodigoCartao = codigoCartao;
    }

    public String getNomeOrigemComercial() {
        return NomeOrigemComercial;
    }

    public void setNomeOrigemComercial(String nomeOrigemComercial) {
        NomeOrigemComercial = nomeOrigemComercial;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public String getDdd() {
        return Ddd;
    }

    public void setDdd(String ddd) {
        Ddd = ddd;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getVago() {
        return Vago;
    }

    public void setVago(String vago) {
        Vago = vago;
    }

    public String getPanvas() {
        return Panvas;
    }

    public void setPanvas(String panvas) {
        Panvas = panvas;
    }

    public String getNumeroEndereco() {
        return NumeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        NumeroEndereco = numeroEndereco;
    }

    public String getComplementoEndereco() {
        return ComplementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        ComplementoEndereco = complementoEndereco;
    }

    public void validarLinha(SecaoDetalhe secaoDetalhe, ArrayList<String> listaErros){

        try{
            char[] arr = getTipRegDetalhe().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo TipRegDetalhe.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getTipRegDetalhe()+"]");
        }

        try{
            char[] arr = getModPlast().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo ModPlast.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getModPlast()+"]");
        }

        try{
            char[] arr = getKit().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Kit.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getKit()+"]");
        }

        try{
            char[] arr = getSeqCart().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo SeqCart.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getSeqCart()+"]");
        }

        try{
            char[] arr = getLinha01().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Linha01.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getLinha01()+"]");
        }

        try{
            char[] arr = getLinha02().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Linha02.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getLinha02()+"]");
        }

        try{
            char[] arr = getLinha03().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Linha03.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getLinha03()+"]");
        }

        try{
            char[] arr = getLinha04().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Linha04.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getLinha04()+"]");
        }

        try{
            char[] arr = getLinhaVerso().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo LinhaVerso.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getLinhaVerso()+"]");
        }

        try{
            char[] arr = getTrilha01().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Trilha01.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getTrilha01()+"]");
        }

        try{
            char[] arr = getTrilha02().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Trilha02.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getTrilha02()+"]");
        }

        try{
            char[] arr = getTrilha03().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Trilha03.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getTrilha03()+"]");
        }

        try{
            char[] arr = getQtdCartoes().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo QtdCartoes.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getQtdCartoes()+"]");
        }

        try{
            char[] arr = getNome().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Nome.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getNome()+"]");
        }

        try{
            char[] arr = getDadosEndereco().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo DadosEndereco.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getDadosEndereco()+"]");
        }

        try{
            char[] arr = getBairro().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Bairro.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getBairro()+"]");
        }

        try{
            char[] arr = getCidade().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Cidade.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCidade()+"]");
        }

        try{
            char[] arr = getUf().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Uf.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getUf()+"]");
        }

        try{
            char[] arr = getCep().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Cep.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCep()+"]");
        }

        try{
            char[] arr = getNroAr().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo NroAr.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getNroAr()+"]");
        }

        try{
            char[] arr = getCepAr().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo CepAr.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCepAr()+"]");
        }

        try{
            char[] arr = getCodRegional().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo CodRegional.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCodRegional()+"]");
        }

        try{
            char[] arr = getCodAgencia().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo CodAgencia.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCodAgencia()+"]");
        }

        try{
            char[] arr = getNmAbrAge().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo NmAbrAge.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getNmAbrAge()+"]");
        }

        try{
            char[] arr = getTpUorPab().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo TpUorPab.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getTpUorPab()+"]");
        }

        try{
            char[] arr = getCodUorPab().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo CodUorPab.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCodUorPab()+"]");
        }

        try{
            char[] arr = getNmAbrPab().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo NmAbrPab.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getNmAbrPab()+"]");
        }

        try{
            char[] arr = getFolder().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Folder.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getFolder()+"]");
        }

        try{
            char[] arr = getCodPab().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo CodPab.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCodPab()+"]");
        }

        try{
            char[] arr = getNomeAdicional().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo NomeAdicional.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getNomeAdicional()+"]");
        }

        try{
            char[] arr = getEnderecoAge().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo EnderecoAge.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getEnderecoAge()+"]");
        }

        try{
            char[] arr = getBairroAge().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo BairroAge.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getBairroAge()+"]");
        }

        try{
            char[] arr = getCidadeAge().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo CidadeAge.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCidadeAge()+"]");
        }

        try{
            char[] arr = getUfAge().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo UfAge.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getUfAge()+"]");
        }

        try{
            char[] arr = getCepAge().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo CepAge.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCepAge()+"]");
        }

        try{
            char[] arr = getContaCorrente().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo ContaCorrente.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getContaCorrente()+"]");
        }

        try{
            char[] arr = getTm().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Tm.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getTm()+"]");
        }

        try{
            char[] arr = getTemplate().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Template.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getTemplate()+"]");
        }

        try{
            char[] arr = getTm2().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Tm2.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getTm2()+"]");
        }

        try{
            char[] arr = getComplemento().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Complemento.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getComplemento()+"]");
        }

        try{
            char[] arr = getCodPlast().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo CodPlast.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCodPlast()+"]");
        }

        try{
            char[] arr = getEmpresa().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Empresa.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getEmpresa()+"]");
        }

        try{
            char[] arr = getFoto().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo Foto.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getFoto()+"]");
        }

        try{
            char[] arr = getVlLimite().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo VlLimite.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getVlLimite()+"]");
        }

        try{
            char[] arr = getDiaVenc().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo DiaVenc.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getDiaVenc()+"]");
        }

        try{
            char[] arr = getCodigoBarras().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo CodigoBarras.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getCodigoBarras()+"]");
        }

        try{
            char[] arr = getDeficienteVisual().toCharArray();
            int i;
            for (i = 0; i<arr.length; i++)
                if (Character.isWhitespace(arr[i])){
                    listaErros.add("Problema no arquivo de embossing, na seção SecaoDetalhe, no campo DeficienteVisual.");
                }
        }catch (Exception e){
            e.getMessage();
            listaErros.add("Linha secao: ["+secaoDetalhe.getDeficienteVisual()+"]");
        }



    }

    private static boolean isInteger(String str) {

        return str != null && str.matches("[0-9]*");
    }
}
