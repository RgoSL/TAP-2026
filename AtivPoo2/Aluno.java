package Atividade02;

public class Aluno extends Pessoa {
    String matricula;

    // Construtor da Subclasse Com Super
    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    // Método Sofrendo Polimorfismo
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }
}