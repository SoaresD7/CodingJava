import java.util.Scanner;

public class Lista02java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String sobrenome;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = sc.nextLine();
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        sc.close();


    }
}
