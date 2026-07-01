// Exercício 04 da Lista

public class Associ { // Representa a Associação Entre Aluno e Curso

    public static void main(String[] args) { // Método Principal para Executar o Programa
        // Criando Objetos da Classe Curso 
        Curso c1 = new Curso("Ciência da Computação");
        Curso c2 = new Curso("Sistemas de Informação");

        // Criando Objetos da Classe Aluno
        Aluno a1 = new Aluno("Lucas Pereira", c1);
        Aluno a2 = new Aluno("Mariana Costa", c2);

        // Exibindo Informações dos Alunos
        System.out.println("=== Alunos Matriculados ==="); 
        a1.exibirInfo();
        a2.exibirInfo();

        System.out.println("\nLucas trocou de curso...");
        a1.setCurso(c2);
        a1.exibirInfo();
    }
}

class Curso { // Representa um Curso Que Pode Ter Vários Alunos

    private String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Aluno { // Representa um Aluno Que Está Associado a Um Curso

    private String nome;
    private Curso curso; 

    public Aluno(String nome, Curso curso) { // Construtor da Classe Aluno
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    // Método Para Exibir Informações do Aluno e do Curso
    public void exibirInfo() {
        System.out.println("Aluno: " + nome + " | Curso: " + curso.getNome());
    }
}
