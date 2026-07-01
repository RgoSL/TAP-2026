// Exercício 03 da Lista

import java.util.ArrayList;

// Classe Relacionamento Demonstra a Relação Entre Departamento e Funcionário
public class Relacionamento {

    public static void main(String[] args) { // Método Principal para Executar o Programa
        // Criando Quatro Objetos da Classe Funcionario
        Funcionario f1 = new Funcionario("Ana Lima"); 
        Funcionario f2 = new Funcionario("Carlos Souza");
        Funcionario f3 = new Funcionario("Beatriz Rocha");
        Funcionario f4 = new Funcionario("Diego Martins");

        Departamento depto = new Departamento("Tecnologia da Informação"); // Criando um Objeto da Classe Departamento
        // Adicionando Funcionários ao Departamento
        depto.adicionarFuncionario(f1); 
        depto.adicionarFuncionario(f2);
        depto.adicionarFuncionario(f3);
        depto.adicionarFuncionario(f4);

        // Exibindo os Funcionários do Departamento
        System.out.println("=== Departamento: " + depto.getNome() + " ==="); 
        depto.listarFuncionarios();

        // Removendo um Funcionário do Departamento
        System.out.println("\nRemovendo: " + f2.getNome());
        depto.removerFuncionario(f2);

        // Exibindo os Funcionários do Departamento Após a Remoção
        System.out.println("\nApós remoção:");
        depto.listarFuncionarios();
    }
}

class Funcionario { // Classe Funcionario Representa um Funcionário 

    private String nome;

    public Funcionario(String nome) { // Construtor da Classe Funcionario
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Departamento { // Essa Classe Representa um Departamento que Contém Funcionários

    private String nome;
    private ArrayList<Funcionario> funcionarios; // Lista de Funcionários do Departamento

    public Departamento(String nome) { // Construtor da Classe Departamento
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    // Método Para Adicionar Funcionários ao Departamento
    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
        System.out.println(f.getNome() + " adicionado ao departamento.");
    }

    // Método Para Remover Funcionários do Departamento
    public void removerFuncionario(Funcionario f) {
        if (funcionarios.remove(f)) {
            System.out.println(f.getNome() + " removido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    // Método Para Listar Funcionários ao Departamento
    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário no departamento.");
            return;
        }
        
        System.out.println("Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println("  - " + f.getNome());
        }
    }
}
