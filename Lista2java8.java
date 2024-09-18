import java.util.Scanner;

public class Lista2java8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double COTACAO_DOLAR_PARA_REAL = 1.82;
         System.out.print("Digite o valor em dólares: ");
         double valorEmDolar = scanner.nextDouble();
          double valorEmReais = valorEmDolar * COTACAO_DOLAR_PARA_REAL;
          System.out.printf("O valor em reais é: R$ %.2f%n", valorEmReais);
           scanner.close();
    }
}
