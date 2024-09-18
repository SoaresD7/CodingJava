import java.util.Scanner;

public class Lista02Java17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o sexo 'M' para masculino e 'F' para feminino: ");
        char sexo = sc.next().charAt(0);
        String saudacao = (sexo == 'M') ? "Seja bem-vindo, Senhor!" : "Seja bem-vinda, Senhora!";
        System.out.println(saudacao);
    }
}

