public class homem extends humano { // Herança da Classe Humano Por Parte da Classe Homem
    public homem(String nome) {
        super(nome);
    }

    // Métodos Polimórficos
@Override
    public void discutir() {
        System.out.println(nome + ": Você está certa.");
        nivelDePaciencia = 20;
    }

@Override
    public void escolherRoupa() {
        System.out.println(nome + ": (Vestiu a primeira roupa que viu.)");
    }

@Override
    public void assistirSerie() {
        System.out.println(nome + ": (Vai assistir Reacher. Tem explosões :D");
    }

 // Método Próprio
public void encontro() {
    System.out.println(nome + ": Deixa que eu pago.");

 }
}