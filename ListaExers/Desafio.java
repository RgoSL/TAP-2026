// Exercício 08 da Lista

public class Desafio { 

    public static void main(String[] args) { // Método Principal Para Executar o Programa

         // Criação de Objetos da Classe Ponto
        Ponto p1 = new Ponto(1.0, 2.0);
        Ponto p2 = new Ponto(4.0, 6.0);
        Ponto p3 = new Ponto(7.0, 10.0); 

        // 
        System.out.println("=== Pontos ===");
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
        System.out.println("P3: " + p3);

        // Exibição das Distâncias Entre os Pontos
        System.out.printf("%nDistância P1 -> P2: %.4f%n", p1.calcularDistancia(p2));
        System.out.printf("Distância P1 -> P3: %.4f%n", p1.calcularDistancia(p3));

        // Exibição dos Coeficientes Angulares Entre os Pontos
        System.out.printf("%nCoeficiente angular P1 -> P2: %.4f%n", p1.calcularCoeficienteAngular(p2));
        System.out.printf("Coeficiente angular P2 -> P3: %.4f%n", p2.calcularCoeficienteAngular(p3));

        // Exibição da Colinearidade dos Pontos
        System.out.println("\n=== Colinearidade ===");
        System.out.println("P1, P2 e P3 são colineares? " + Ponto.saoColineares(p1, p2, p3));

        Ponto p4 = new Ponto(5.0, 5.0); // Teste de Colinearidade com um Ponto Fora da Linha 
        System.out.println("P1, P2 e P4 são colineares? " + Ponto.saoColineares(p1, p2, p4));
    }
}

class Ponto { // Classe Ponto com Atributos e Métodos

    private double x;
    private double y;

    public Ponto(double x, double y) { // Construtor da Classe Ponto
        this.x = x;
        this.y = y;
    }

    // Métodos Getters Para Obter as Coordenadas do Ponto
    public double getX() { return x; }
    public double getY() { return y; }

    // Método Para Calcular a Distância Entre Dois Pontos
    public double calcularDistancia(Ponto outro) {
        double dx = outro.x - this.x;
        double dy = outro.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método Para Calcular o Coeficiente Angular Entre Dois Pontos
    public double calcularCoeficienteAngular(Ponto outro) {
        double dx = outro.x - this.x;
        if (dx == 0) {
            System.out.println("Reta vertical: coeficiente angular indefinido.");
            return Double.NaN;
        }
        return (outro.y - this.y) / dx;
    }

    // Método Estático Para Verificar se Três Pontos São Colineares
    public static boolean saoColineares(Ponto a, Ponto b, Ponto c) {
        double area = a.x * (b.y - c.y)
                    + b.x * (c.y - a.y)
                    + c.x * (a.y - b.y);
        return area == 0;
    }

    // Sobrescrita do Método toString Para Exibir as Coordenadas do Ponto
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}