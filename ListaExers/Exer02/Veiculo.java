package Exer02;

public class Veiculo { // Classe Veiculo é a Superclasse de Carro e Moto
    private String modelo; // Atributo Modelo do Veiculo
    private String marca; // Atributo Marca do Veiculo
    private int ano; // Atributo Ano de Lançamento do Veiculo

    public Veiculo(){} // Construtor da Classe Veiculo

    // Construtor da Classe Veiculo com parâmetros
    public Veiculo(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    // Métodos Getters e Setters para os Atributos da Classe Veiculo
    public void setModelo(String novoModelo) {
        modelo = novoModelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String novaMarca) {
        marca = novaMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setAno(int novoAno) {
        if (novoAno >= 1886) {  // Validando o Ano de Lançamento do Veiculo
        ano = novoAno;
        } else {
            throw new IllegalArgumentException("Ano de Lançamento Inválido"); // Lançando uma Exceção para Anos Inválidos
        }
        
    }

    public int getAno() {
        return ano;
    }

    // Método para Exibir os Dados do Veiculo
    public void exibirDados(){
        System.out.println("Dados do Veículo :");
        System.out.println("Modelo : " + modelo +"\n" + "Marca : " + marca +"\n" + "Ano : " + ano);
    }
}