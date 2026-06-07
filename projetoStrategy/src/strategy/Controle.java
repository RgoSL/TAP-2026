package strategy;

public class Controle {
    public static void main(String [] args){

    //Criando os Objetos de Cada Operação
    Calculadora s = new Soma();
    Calculadora m = new Multiplicacao();
    Calculadora sub = new Subtracao();
    Calculadora d = new Divisao();

    // Exibindo os Resultados de Cada Operação
    System.out.println("Soma: " + s.calcular(2, 2));
    System.out.println("Multiplicação: " + m.calcular(3, 3));
    System.out.println("Subtração: " + sub.calcular(4, 4));
    System.out.println("Divisão: " + d.calcular(5, 5));

    // Exibindo o Resultado da Divisão por Zero
    System.out.println("Divisão Por Zero: " + d.calcular(6, 0));

    // Exibindo a Mensagem Explicativa Sobre a Divisão Por Zero
    System.out.println("Em uma divisão por 0, o próprio Java exibe a mensagem 'Infinity'");
    System.out.println("para indicar que o resultado é infinito, pois a divisão por zero não é definida matematicamente.");
    }
}