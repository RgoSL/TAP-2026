public class mulher extends humano{  // Herança da Classe Humano Por Parte da Classe Mulher

    public mulher(String nome) {
        super(nome);
    }  
    
    // Métodos Polimórficos
@Override
public void discutir() {
    System.out.println(nome + ": Mas sabe o que eu acho engraçado...");
    nivelDePaciencia -= -1;
}

@Override
public void escolherRoupa() {
    System.out.println(nome + ": (Trocou de roupa 5 vezes e optou pela primeira que vestiu)");
}

@Override
    public void assistirSerie() {
        System.out.println(nome + ": (Com certeza é um Dorama.)");
    }

    // Método Próprio
public void lembrarDeAlgoAntigo() {
    System.out.println(nome + ": E aquela vez 6 meses atrás que você curtiu uma foto...");
}
 }