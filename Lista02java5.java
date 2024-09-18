import java.util.Scanner;

public class Lista02java5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Le a idade da pessoa
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Calcula o número de dias vividos
        int diasVividos = idade * 365;

        // Informa o número de dias vividos
        System.out.printf("Você já viveu aproximadamente %d dias.\n", diasVividos);
        scanner.close();
    }
}
