package Exercicio01;

public class Aluno {
    private String nome;
    private double nota;    

    // Método Para Definir o Nome do Aluno
    public void setNome(String novoNome) {
    nome = novoNome;
}

    public void setNota(double novaNota) {
        // Condicional Para Validar Intervalo Permitido
        if(novaNota >= 0 && novaNota <= 10){
        nota = novaNota;
        } else {
            System.out.println("Nota Inválida");
        }
    }
    public String getNome() {
        return nome;
    }

    public double getNota(){
        return nota;
    }

    // Método Para Comparar e Retornar o Status do Aluno
    public String getSituacao() {
        if (nota >= 6) {
            return "Aluno Aprovado!";

        } else {
            return "Aluno Reprovado!";
        }
    }

    public void exibirInfos() {
        System.out.println("Aluno(a): " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Situação: " + getSituacao());
    }
}