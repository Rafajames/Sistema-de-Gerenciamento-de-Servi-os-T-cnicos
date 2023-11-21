package minhasClasses;

/**
 * Representa uma solicitação de serviço, contendo informações de datas.
 */
public class SolicitacaoServico {

    // Atributos da solicitação de serviço
    public String solicitacao;
    public String inicio;
    public String conclusao;

    /**
     * Construtor da classe SolicitacaoServico.
     *
     * @param solicitacao Data de solicitação.
     * @param inicio      Data de início.
     * @param conclusao   Data de conclusão.
     */
    public SolicitacaoServico(String solicitacao, String inicio, String conclusao) {
        this.solicitacao = solicitacao;
        this.inicio = inicio;
        this.conclusao = conclusao;
    }

    /**
     * Método para obter a data de solicitação.
     *
     * @return Data de solicitação.
     */
    public String getSolicitacao() {
        return solicitacao;
    }

    /**
     * Método para definir a data de solicitação.
     *
     * @param solicitacao Nova data de solicitação.
     */
    public void setSolicitacao(String solicitacao) {
        this.solicitacao = solicitacao;
    }

    /**
     * Método para obter a data de início.
     *
     * @return Data de início.
     */
    public String getInicio() {
        return inicio;
    }

    /**
     * Método para definir a data de início.
     *
     * @param inicio Nova data de início.
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     * Método para obter a data de conclusão.
     *
     * @return Data de conclusão.
     */
    public String getConclusao() {
        return conclusao;
    }

    /**
     * Método para definir a data de conclusão.
     *
     * @param conclusao Nova data de conclusão.
     */
    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    /**
     * Método para exibir informações sobre a solicitação de serviço.
     */
    public void exibeInformacoes() {
        System.out.println("Data da Solicitação: " + solicitacao);
        System.out.println("Data de Início: " + inicio);
        System.out.println("Data de Término: " + conclusao);
    }
}
