// Clase Modelo Que Estrutura as Classes Filho

public abstract class humano {

    // Métodos Protegidos Para Indicar Baixa Adesão a Alteração Direta
    protected String nome;
    protected int nivelDePaciencia = 50;
    protected int nivelDeOrganizacao = 50;

    public humano(String nome) {
        this.nome = nome; // This é Como o Self do Python, Referencia a Instância Atual
    }

     // Métodos Padrões Que os Filhos Terão
    public abstract void discutir();

    public void assistirSerie() {
        System.out.println(nome + " começou uma série nova.");
    }

    public void escolherRoupa() {
        System.out.println(nome + " escolheu uma roupa.");
    }
}