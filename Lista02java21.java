import java.util.Scanner;
public class Lista02java21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        if (salario <= 645) {
            System.out.println("Até 1 salário mínimo");
        } else if (salario > 645 && salario <= 1935) {
            System.out.println("Até 3 salários mínimos");
        } else if (salario > 1935 && salario <= 3225) {
            System.out.println("Até 5 salários mínimos");
        } else {
            System.out.println("Acima de 5 salários mínimos");
        }
    }
}

