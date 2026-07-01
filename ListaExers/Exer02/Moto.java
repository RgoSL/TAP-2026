package Exer02;

public class Moto extends Veiculo { // Classe Moto é Uma Subclasse de Veiculo

    public Moto() { // Construtor da Classe Moto
        Veiculo moto01 = new Veiculo(); // Criando um Objeto da Classe Veiculo
        moto01.setModelo("Ninja H2R"); 
        moto01.setMarca("Kawasaki");
        moto01.setAno(2014);
    }
}