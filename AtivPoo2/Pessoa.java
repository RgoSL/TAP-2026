package Atividade02;

public class Pessoa {
    String nome;
    String cpf;

    // Método Construtor do Modelo Pessoa
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDados() { // Método Que Vai Ser Herdado Pelas Demais Classes
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}