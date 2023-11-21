package minhasClasses;

import java.math.BigDecimal;

/**
 * Representa um serviço associado a uma solicitação de serviço.
 * Contém informações como descrição, valor e data de conclusão.
 */
public class Servico extends SolicitacaoServico {
    private String servico;
    private String descricao;
    private BigDecimal valor;

    public Servico(String servico, String descricao, BigDecimal valor, String solicitacao, String inicio, String conclusao, String string) {
        super(solicitacao, inicio, conclusao);
        this.servico = servico;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("Serviço: " + servico);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
    }
}
