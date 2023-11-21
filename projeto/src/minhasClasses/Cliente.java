package minhasClasses;

/**
 * Representa um cliente que herda características da classe Pessoa.
 */
public class Cliente extends Pessoa {

    // Atributos específicos do Cliente
    private Long telefone;
    private String endereco;

    /**
     * Construtor da classe Cliente.
     *
     * @param nome     
     * @param cpf      
     * @param telefone 
     * @param endereco 
     */
    public Cliente(String nome, String cpf, Long telefone, String endereco) {
        super(nome, cpf);
        this.telefone = telefone;
        this.endereco = endereco;
    }

    /**
     * Obtém o número de telefone do cliente.
     *
     * @return Número de telefone do cliente.
     */
    public Long getTelefone() {
        return telefone;
    }

    /**
     * Define o número de telefone do cliente.
     *
     * @param telefone Novo número de telefone do cliente.
     */
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o endereço do cliente.
     *
     * @return Endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     *
     * @param endereco Novo endereço do cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Método que representa a ação de um cliente solicitando serviços.
     */
    public void solicitaServicos() {
        System.out.println("Cliente solicita serviços.");
    }

    /**
     * Método para exibir informações do cliente.
     */
    public void exibeInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
    }
}
