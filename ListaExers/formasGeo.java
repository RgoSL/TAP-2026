// Exercício 07 da Lista

public class formasGeo { // Classe Principal Para Testar as Formas Geométricas

    public static void main(String[] args) { // Método principal Para Executar o Programa

        Forma[] formas = new Forma[4]; // Criação de um Array de Formas Geométricas
        formas[0] = new Circulo(5.0); // Criação de um Objeto da Classe Circulo
        formas[1] = new Retangulo(4.0, 6.0); // Criação de um Objeto da Classe Retangulo
        formas[2] = new Circulo(3.0); 
        formas[3] = new Retangulo(2.5, 8.0); 

        // Exibição Das Informações das Formas Geométricas
        System.out.println("=== Formas Geométricas ===");
        for (Forma f : formas) {
            f.exibirInfo();
            System.out.println("---");
        }
    }
}

abstract class Forma { // Classe Abstrata Para Representar uma Forma Geométrica

    public abstract double calcularArea(); // Método Abstrato Para Calcular a Área da Forma

    public abstract double calcularPerimetro(); // Método Abstrato Para Calcular o Perímetro da Forma

    public void exibirInfo() { // Método Para Exibir as Informações da Forma Geométrica
        System.out.printf("Tipo: %s | Área: %.2f | Perímetro: %.2f%n",
                this.getClass().getSimpleName(),
                calcularArea(),
                calcularPerimetro());
    }
}

class Circulo extends Forma { // Classe Para Representar um Círculo

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação dos Métodos Abstratos da Classe Forma
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Retangulo extends Forma { // Classe Para Representar um Retângulo

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação dos Métodos Abstratos da Classe Forma
    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}