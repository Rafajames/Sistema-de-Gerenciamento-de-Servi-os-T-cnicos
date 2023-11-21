package minhasClasses;

/**
 * Classe base representando uma pessoa com nome e CPF.
 */
public class Pessoa {
    // Atributos
    private String nome;
    private String cpf;

    /**
     * Construtor da classe Pessoa.
     * @param nome 
     * @param cpf  
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Método para obter o nome da pessoa.
     * @return Nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome da pessoa.
     * @param nome Novo nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o CPF da pessoa.
     * @return CPF da pessoa.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Método para definir o CPF da pessoa.
     * @param cpf Novo CPF da pessoa.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Método que exive informações da pessoa.
     */
    public void exibeInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
