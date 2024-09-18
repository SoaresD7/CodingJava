import java.util.Scanner;

public class Lista2java10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu primeiro nome: ");
        String primeiroNome = scanner.nextLine();
        System.out.println("Olá, " + primeiroNome + "! Seja bem-vindo(a)!");
        scanner.close();
    }
}
