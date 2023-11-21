package minhasClasses;

/**
 * Representa um atendente que herda características da classe Pessoa.
 */
public class Atendente extends Pessoa {

    /**
     * Construtor da classe Atendente.
     * @param nome 
     * @param cpf  
     */
    public Atendente(String nome, String cpf) {
        super(nome, cpf);
    }

    /**
     * Método que representa a ação de um atendente solicitando serviços.
     */
    public void solicitaServicos() {
        System.out.println("Atendente solicita serviços.");
    }
    /**
     * Método que representa a ação de um atendente realizando a atribuição de serviço.
     */
    public void realizaAtribuicaoServico() {
        System.out.println("Atendente realiza atribuição de serviço.");
    }
    /**
     * Método que exibe informações do atendente.
     */
    @Override
    public void exibeInformacoes() {
        System.out.println("Informações do Atendente: ");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
    }
}
