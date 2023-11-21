import java.math.BigDecimal;

import minhasClasses.Atendente;
import minhasClasses.Cliente;
import minhasClasses.SolicitacaoServico;
import minhasClasses.Tecnico;
import minhasClasses.Servico;

public class TesteProjeto {
    public static void main(String[] args) throws Exception {

        // Criando objetos Cliente, Atendente, Tecnico, Servico, SolicitacaoServico
        Cliente cliente = new Cliente("Marcos Moura", "258.365.125.96", 95954875223L, "Rua Cantos dos Passaros, 25");
        Atendente atendente = new Atendente("Mari Lu", "321.636.587.32");
        Tecnico tecnico = new Tecnico("Jorge Aguiar", "695.654.875.30", "95986123214");
        Servico servico = new Servico("Manutenção", "Troca de tela", new BigDecimal("200.00"), "Tela de LCD", "Mari Lu", "Marcos Moura", "Jorge Aguiar");
        SolicitacaoServico solicitacaoServico = new SolicitacaoServico("09-08-2023", "10-08-2023", "10-08-2023");

        // Exibe informações
        exibeInformacoes(cliente, tecnico, atendente, servico, solicitacaoServico);
    }

    public static void exibeInformacoes(Cliente cliente, Tecnico tecnico, Atendente atendente, Servico servico, SolicitacaoServico solicitacaoServico) {
        
        System.out.println("Informações do cliente: "); // Informações do Cliente

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Endereço: " + cliente.getEndereco());
    
        System.out.println("Informações do Técnico: "); // Informações do Tecnico

        System.out.println("Nome: " + tecnico.getNome());
        System.out.println("CPF: " + tecnico.getCpf());
        System.out.println("Telefone: " + tecnico.getTelefone());
    
        System.out.println("Informações da atendente: "); // Informações do Atendente

        System.out.println("Nome: " + atendente.getNome());
        System.out.println("CPF: " + atendente.getCpf());
    
        System.out.println("Informações do serviço: "); // Informações do Serviço

        System.out.println("Descrição: " + servico.getDescricao());
        System.out.println("Valor: " + servico.getValor());
    
        System.out.println("Informações da solicitação de serviço: "); // Informações sobre a data do serviço

        System.out.println("Data da Solicitação: " + solicitacaoServico.getSolicitacao());
        System.out.println("Data de Início: " + solicitacaoServico.getInicio());
        System.out.println("Data de Término: " + solicitacaoServico.getConclusao());
    }
    

    }

    

