import java.util.Scanner;

public class Lista02java7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Le o salário do funcionário
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        // Calcula o reajuste de
        double reajuste = salarioAtual * 0.07;

        // Calcula novo salário
        double novoSalario = salarioAtual + reajuste;

        // Mostra o salário reajustado
        System.out.printf("O salário com reajuste é: R$ %.2f\n", novoSalario);
        scanner.close();
    }
}
