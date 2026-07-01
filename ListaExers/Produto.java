// Exercício 01 da Lista

public class Produto {  // Encapsulamento Dos Atributos da Classe
    private String nome;
    private double preco;
    private int quantidade;

        // Método Construtor Padrão da Classe
    public Produto(){}

        // Método Construtor Com Todos os Atributos Necessários de um Produto
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

        // Método Setter do Nome do Produto
    public void setNome(String nomeProduto) {
        nome = nomeProduto;
    }

        // Método Setter do Preço do Produto
    public void setPreco(double novoPreco) {
        if (novoPreco >= 0) { // Validador de Números Negativos
        preco = novoPreco;        
        } else { // Exceção de Erro ao Invés de SOUT Comum
            throw new IllegalArgumentException("Preço do Produto é Negativo");
        }
    }
    
        // Método Setter do Quantidade Existente do Produto
    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade >= 0) { // Validador de Números Negativos
        quantidade = novaQuantidade;
        } else { // Exceção de Erro ao Invés de SOUT Comum
            throw new IllegalArgumentException("Quantidade de Produtos é Negativa");
        }
    }

        // Getters Dos Atributos da Classe
    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Método de Exibição Das Informações da Classe
    public void exibirInformacoes() {
        System.out.println("Existem " + quantidade + " unidades de " + nome + " em estoque.");
        System.out.println("Preço atual de " + nome + " é " + preco);
    }
} 