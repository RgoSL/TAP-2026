// Exercício 05 da Lista

public class exer05 { // O Objetivo Foi Criar uma Classe Pessoa Com Manipulação de Informações

    public static void main(String[] args) {  // Método principal Para Executar o Programa
        Pessoa p = new Pessoa("Juliana Alves", 25); // Criação de um objeto da classe Pessoa

        //Exibição Das informações Antes do Envelhecimento 
        System.out.println("=== Antes de envelhecer ===");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

        // Envelhecimento da Pessoa em 10 Anos
        p.envelhecer(10);

        //Exibição Das informações Após o Envelhecimento 
        System.out.println("\n=== Após envelhecer 10 anos ===");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
    }
}

class Pessoa { // Classe Pessoa com Atributos e Métodos

    private String nome;
    private int idade;

    // Construtor da Classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método Para Obter o Nome da Pessoa
    public String getNome() {
        return this.nome;
    }

    // Método Para Obter a Idade da Pessoa
    public int getIdade() {
        return this.idade;
    }

    // Método Para Envelhecer a Pessoa em um Determinado Número de Anos
    public void envelhecer(int anos) {
        this.idade += anos;
    }
}
