// Exercício 06 da Lista

public class testarCalculadora {  // Classe Principal Para Executar a Calculadora

    public static void main(String[] args) { // Método principal Para Executar o Programa
        Calculadora calc = new Calculadora(); // Criação de um Objeto da Classe Calculadora

        // Testando os Métodos da Calculadora
        System.out.println("=== Soma ==="); 
        System.out.println("somar(int, int):       " + calc.somar(5, 3));
        System.out.println("somar(double, double): " + calc.somar(5.5, 3.2));

        // Testando os Métodos de Subtração
        System.out.println("\n=== Subtração ===");
        System.out.println("subtrair(int, int):       " + calc.subtrair(10, 4));
        System.out.println("subtrair(double, double): " + calc.subtrair(10.8, 4.3));

        // Testando os Métodos de Multiplicação
        System.out.println("\n=== Multiplicação ===");
        System.out.println("multiplicar(int, int):       " + calc.multiplicar(3, 7));
        System.out.println("multiplicar(double, double): " + calc.multiplicar(2.5, 4.0));
    }
}

class Calculadora { // Classe Calculadora com Métodos de Operações Matemáticas

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public int multiplicar(int a, int b) { // Método Para Multiplicar Dois Números Inteiros
        return a * b;
    }

    public double multiplicar(double a, double b) { // Método Para Multiplicar Dois Números Decimais
        return a * b;
    }
}