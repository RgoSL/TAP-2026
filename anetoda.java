// Classe Responsável Pela Chamada/Ativação Dos Métodos Criados Nos 3 Modelos.

public class anetoda {
    public static void main(String[] args) {
        
        // Instâncias Apenas da Classe Humano
        humano helena = new mulher("Helena"); 
        humano rodrigo = new homem("Rodrigo");

        homem Rodrigo = new homem("Rodrigo"); // Instância da Classe Homem
        mulher Helena = new mulher("Helena"); // Instância da Classe Mulher

        // Chamada Dos Métodos Próprios de Cada Classe
        Rodrigo.encontro();
        Helena.lembrarDeAlgoAntigo();

        // Chamadas Dos Métodos da Classe Humano
        helena.discutir();
        rodrigo.discutir();

        helena.escolherRoupa();
        rodrigo.escolherRoupa();

        helena.assistirSerie();
        rodrigo.assistirSerie();
    }
}