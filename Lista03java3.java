import java.util.Scanner;

public class Lista03java3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, opcao, resultado;
        System.out.print("Digite o número 1: ");
        n1 = scanner.nextInt();

        System.out.print("Digite o número 2: ");
        n2 = scanner.nextInt();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("O resultado é: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("O resultado é: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("O resultado é: " + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                System.out.println("O resultado é: " + resultado);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}