import java.util.Scanner;

public class WhileC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir?");
        int quantidade = scanner.nextInt();

        int soma = 0;
        int contador = 0;

        while (contador < quantidade) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
            contador++;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}


