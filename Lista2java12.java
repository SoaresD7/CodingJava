import java.util.Scanner;

public class Lista2java12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite o seu Telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone); ;
        scanner.close();
    }
}
