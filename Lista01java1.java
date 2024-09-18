import java.util.Scanner;

public class Lista01java1 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        int numero3 = scanner.nextInt();
        System.out.println("Digite o quarto numero");
        int numero4 = scanner.nextInt();
        int soma = numero1 + numero2 + numero3 + numero4;
        System.out.println("A soma dos quatro numeros " + soma);
           scanner.close();
    }
}
