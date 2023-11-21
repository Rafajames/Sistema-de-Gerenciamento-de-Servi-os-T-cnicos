package minhasClasses;

/**
 * Representa um técnico que herda características da classe Pessoa.
 */
public class Tecnico extends Pessoa {

    private String telefone; // Atributo específico do Técnico

    /**
     * Construtor da classe Técnico.
     *
     * @param nome     
     * @param cpf      
     * @param telefone 
     */
    public Tecnico(String nome, String cpf, String telefone) {
        super(nome, cpf);
        this.telefone = telefone;
    }

    /**
     * @return Número de telefone do técnico.
     */
    public String getTelefone() {
        return telefone;
    }

    /**  
     * @param telefone 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método que representa a ação de um técnico realizando um serviço.
     */
    public void realizaServico() {
        System.out.println("Técnico realiza serviço.");
    }

    /**
     * Método que exibe informações do técnico.
     */
    public void exibeInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + telefone);
    }
}
