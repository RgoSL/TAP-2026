package Exer02;

public class Carro extends Veiculo { // Classe Carro é Uma Subclasse de Veiculo

    public Carro() { // Construtor da Classe Carro
        Veiculo carro01 = new Veiculo();
        carro01.setModelo("Chiron Super Sport 300+"); // Atribuindo o Modelo do Carro
        carro01.setMarca("Bugatti"); // Atribuindo a Marca do Carro
        carro01.setAno(2019); // Atribuindo o Ano do Carro
    }
}